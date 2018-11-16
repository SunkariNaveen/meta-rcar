DESCRIPTION = "V3X specific packages"

LICENSE = "BSD-3-Clause & GPLv2+ & LGPLv2+"

inherit packagegroup

PACKAGES = " \
    packagegroup-v3x \
"

# V3x common packages: IMP UIO, CMEM, CV lib, ICCOM
RDEPENDS_packagegroup-v3x = " \
    br-test \
    kernel-module-cmemdrv \
    kernel-module-iccom \
    kernel-module-uio-imp \
    kernel-module-uio-isp \
    libiccom \
    udev-rules-cvlib \
"
