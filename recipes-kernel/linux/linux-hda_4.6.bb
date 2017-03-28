LINUX_VERSION = "4.6"
# This points to xilinx-v2016.3 tag
SRCREV ?="${AUTOREV}"

KBUILD_DEFCONFIG ?= "zynq_hda_adv7511_defconfig"
include linux-hda.inc

