DESCRIPTION = "PetaLinux Packages, all packages avaliable in PetaLinux"
LICENSE = "NONE"

inherit packagegroup

# Packages
RDEPENDS_${PN} = "\
	bash \
	bridge-utils \
	bzip2 \
	dropbear \
	e2fsprogs \
	ethtool \
	flex \
	glib-2.0 \
	gmp \
	i2c-tools \
	iproute2 \
	iptables \
	libnet \
	libpcre \
	libpng \
	libusb-compat \
	libusb1 \
	mtd-utils \
	net-tools \
	netcat \
	dropbear-openssh-sftp-server \
	openssh-sftp-server \
	pciutils \
	popt \
	portmap \
	tcpdump \
	unzip \
	usbutils \
	util-linux \
	zlib \
	strace \
	"

QT_EXTRAS = " \
        ruby \
	cpufrequtils \
	qtbase-dev \
	qtbase-fonts \
	qtbase-mkspecs \
	qtbase-plugins \
	qtsystems-dev \
	qtsystems-mkspecs \
	qtbase-staticdev \
	qttranslations-qt \
	qttranslations-qtbase \
	qttranslations-qtconfig \
	qttranslations-qthelp \
	qtconnectivity-dev \
	qtconnectivity-mkspecs \
	qttranslations-qtconnectivity \
	qtdeclarative-dev \
	qtdeclarative-mkspecs \
	qtdeclarative-plugins \
	qtdeclarative-staticdev \
	qttranslations-qmlviewer \
	qttranslations-qtdeclarative \
	qtenginio-dev \
	qtenginio-mkspecs \
	qtimageformats-dev \
	qtimageformats-plugins \
	qtlocation-dev \
	qtlocation-mkspecs \
	qtlocation-plugins \
	qttranslations-qtmultimedia \
	qtscript-dev \
	qtscript-mkspecs \
	qttranslations-qtscript \
	qtsensors-dev \
	qtsensors-mkspecs \
	qtsensors-plugins \
	qtserialport-dev \
	qtserialport-mkspecs \
	qtsvg-dev \
	qtsvg-mkspecs \
	qtsvg-plugins \
	qttools-dev \
	qttools-mkspecs \
	qttools-staticdev \
	qttools-tools \
	qtwebsockets-dev \
	qtwebsockets-mkspecs \
	qttranslations-qtwebsockets \
	qtwebchannel-dev \
	qtwebchannel-mkspecs \
	qtxmlpatterns-dev \
	qtxmlpatterns-mkspecs \
	qttranslations-qtxmlpatterns \
	qtbase-examples \
	qtquickcontrols-qmlplugins \
	qttools-plugins \
	qwt \
	libopencv-core-dev \
	libopencv-highgui-dev \
	libopencv-imgproc-dev \
	libopencv-objdetect-dev \
	libopencv-ml-dev \
	libopencv-calib3d \
	"

ZYNQ_EXTRAS = " \
	libattr \
	libinput \
 	opencv \
	python-numpy \
	python-scons \
	python-shell \
	python-threading \
	python-smartpm \
	smartmontools \
	tcf-agent \
	v4l-utils \
	yavta \
	libmetal \
	ffmpeg \
	gstreamer \
	gdb \
	qwt \
	"

X11_PACKAGES = " \
	xauth \
	xhost \
	xset \
	xtscal \
	xcursor-transparent-theme \
	xinit \
	xinput \
	xinput-calibrator \
	xkbcomp \
	xkeyboard-config \
	xkeyboard-config-locale-en-gb \
	xmodmap \
	xrandr \
	xserver-nodm-init \
	"

XSERVER ?= " \
        xserver-xorg \
        xf86-input-evdev \
        xf86-input-mouse \
        xf86-input-keyboard \
        xf86-video-fbdev \
        "

MATCHBOX_PACKAGES = " \
       matchbox-config-gtk \
       matchbox-desktop \
       matchbox-keyboard \
       matchbox-keyboard-applet \
       matchbox-panel-2 \
       matchbox-session \
       matchbox-terminal \
       matchbox-theme-sato \
       matchbox-desktop-sato \
       matchbox-session-sato \
       matchbox-wm \
       sato-icon-theme \
       settings-daemon \
       "

RDEPENDS_${PN}_append_zynq += " \
	${ZYNQ_EXTRAS} \
	${QT_EXTRAS} \
	${@bb.utils.contains('DISTRO_FEATURES', 'x11', '${XSERVER} \
			${X11_PACKAGES} ${MATCHBOX_PACKAGES}', '', d)} \
	"
