LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

# This version extension should match CONFIG_LOCALVERSION in defconfig
LINUX_VERSION_EXTENSION ?= "-hda"
PV = "${LINUX_VERSION}${LINUX_VERSION_EXTENSION}+git${SRCPV}"

PROVIDES = "linux-hda"

SRC_URI = " \
		https://github.com/wafgo/linux-kernel-custom-hw-uio \
		"

#SRC_URI = " \
#		git:///home/sefo/devel/git/kernel-4.x.git;protocol=file \
#		"

require recipes-kernel/linux/linux-yocto.inc

KERNEL_IMAGETYPE ?= "uImage"
KERNEL_DEVICETREE ="zynq-zed-disp-coproc.dtb"

DESCRIPTION = "University Of Applied Sciences Darmstadt Linux Kernel cloned from Analog Devices"

kernel_do_configure() {
	oe_runmake_call -C ${S} O=${B} ${KBUILD_DEFCONFIG}
}

