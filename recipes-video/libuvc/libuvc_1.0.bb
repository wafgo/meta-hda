SUMMARY = "Opencv : The Open Computer Vision Library"
SECTION = "libs"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2f1963e0bb88c93463af750daf9ba0c2"

DEPENDS = "libusb libjpeg-turbo"

inherit pkgconfig cmake

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/ktossell/libuvc.git;protocol=git"

S="${WORKDIR}/git"

FILES_${PN} += "${libdir}/*"
FILES_${PN}-dev = "${includedir}"
