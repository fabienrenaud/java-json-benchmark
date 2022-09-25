#!/usr/bin/env python3

import csv
import os
import re


def parse_file_info(f):
    words = f.replace('.txt', '').split('-')
    return {
        'datatype': words[0],
        'command': words[1],
        'number': words[2],
        'size': words[3]
    }


def extract_scores(f):
    result = {}
    with open(f) as fh:
        lines = fh.readlines()
    complete = False
    benchmark = False
    for l in lines:
        if not complete and l.startswith("# Run complete. Total time:"):
            complete = True
        elif complete:
            if benchmark:
                values = re.split('\s+', l)
                if len(values) > 3:
                    name = values[0].split('.')[-1]
                    score = values[3]
                    result[name] = score
            elif l.startswith('Benchmark'):
                benchmark = True
    return result


cwd = os.getcwd()
sheets = {}
for f in os.listdir(cwd):
    if os.path.isfile(f) and f.endswith('.txt'):
        fileInfo = parse_file_info(f)
        scores = extract_scores(f)

        sheetName = "{}-{}-{}".format(fileInfo['datatype'],
                                      fileInfo['command'], fileInfo['number'])
        if sheetName not in sheets:
            sheets[sheetName] = {}

        size = fileInfo['size']
        for k, v in scores.items():
            if k not in sheets[sheetName]:
                sheets[sheetName][k] = {}
            sheets[sheetName][k][size] = v


for filename, v in sheets.items():
    fieldnames = ['Test']
    rows = []
    for libname, scores in v.items():
        row = {}
        row['Test'] = libname
        for size, score in scores.items():
            fieldname = "{}kb (x{})".format(size, size)
            if fieldname not in fieldnames:
                fieldnames.append(fieldname)
            row[fieldname] = float(score) * int(size)
        rows.append(row)

    if not os.path.exists('csv/'):
        os.mkdir('csv')
    csvfilename = "csv/{}.csv".format(filename)
    with open(csvfilename, 'w', newline='') as csvfile:
        writer = csv.DictWriter(csvfile, fieldnames=fieldnames)
        writer.writeheader()
        writer.writerows(rows)
