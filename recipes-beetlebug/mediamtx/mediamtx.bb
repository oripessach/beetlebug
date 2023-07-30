SUMMARY = "MediaMTX / rtsp-simple-server is a ready-to-use and zero-dependency server and proxy that allows users to publish, read and proxy live video and audio streams."
GO_IMPORT = "github.com/bluenviron/mediamtx"
HOMEPAGE = "https://${GO_IMPORT}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=77fd2623bd5398430be5ce60489c2e81"

SRC_URI = "git://${GO_IMPORT};branch=main;protocol=https"
SRCREV = "65f617aa7c326f491c4f4f4a4d52beea3bd6abc7"

GO_INSTALL = "${GO_IMPORT}"
do_compile[network] = "1"

# build executable instead of shared object
GO_LINKSHARED = ""
GOBUILDFLAGS:remove = "-buildmode=pie"

inherit go-mod

FILES:${PN} += "/usr/local/bin"

