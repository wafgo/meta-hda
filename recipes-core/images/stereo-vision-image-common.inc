inherit core-image

COMMON_FEATURES = " \
    ssh-server-dropbear \
    "
IMAGE_FEATURES += "${COMMON_FEATURES}"

ZYNQ_FEATURES = " \
    tools-debug \
    tools-profile \
    "
IMAGE_FEATURES_append_zynq += " ${ZYNQ_FEATURES}"

COMMON_INSTALL = " \
    i2c-tools \
    openssh-sftp-server \
    tcf-agent \
    usbutils \
    "

STEREO_VISION_INSTALL = " \
    libuvc \
   "

IMAGE_INSTALL += " \
    packagegroup-core-boot \
    opkg \
    ${STEREO_VISION_INSTALL} \
    ${COMMON_INSTALL} \
    ${ROOTFS_PKGMANAGE_BOOTSTRAP} \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    "

IMAGE_LINGUAS = " "
