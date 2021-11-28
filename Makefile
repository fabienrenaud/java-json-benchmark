
.PHONY: tar
tar:
	tar czf app.tar.gz build.gradle settings.gradle src Makefile gradle gradlew run run-everything

.PHONY: packer
packer: tar
	packer build ami.json
