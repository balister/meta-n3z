SUMMARY = "A console-only image with a development/debug \
environment suitable for building GNURadio installed."

IMAGE_FEATURES += "ssh-server-openssh \
                   debug-tweaks \
		   tools-sdk \
		   tools-debug \
                   dev-pkgs \
		   package-management \
                   tools-profile \
                  "

EXTRA_IMAGE_FEATURES += "package-management"

LICENSE = "MIT"

TOOLCHAIN_TARGET_TASK_append = " kernel-devsrc"

CORE_IMAGE_EXTRA_INSTALL = "\
    i2c-tools \
    screen \
    vim \
    vim-vimrc \
    git \
    wget \
    python \
    python-modules \
    python-pyserial \
    python-numpy \
    htop \
    sshfs-fuse \
    openssh-sftp \
    openssh-sftp-server \
    fftw-dev \
    devmem2 \
    kernel-modules \
    kernel-devsrc \
    hostapd \
    dnsmasq \
    python-flask \
    "

inherit core-image image-buildinfo
