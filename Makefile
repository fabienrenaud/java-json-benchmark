
AWS_PROFILE ?= java-json-benchmark

.PHONY: tar
tar:
	tar czf app.tar.gz build.gradle settings.gradle src Makefile gradle gradlew run run-everything

.PHONY: packer
packer: tar
	AWS_PROFILE=$(AWS_PROFILE) packer build ami.json
