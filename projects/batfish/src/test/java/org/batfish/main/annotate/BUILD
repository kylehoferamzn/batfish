load("@batfish//skylark:junit.bzl", "junit_tests")

package(
    default_testonly = True,
    default_visibility = ["//visibility:public"],
)

junit_tests(
    name = "tests",
    srcs = glob([
        "**/*Test.java",
    ]),
    resources = [
        "//projects/batfish/src/test/resources:log4j_config",
        "//projects/batfish/src/test/resources/org/batfish/main/annotate/testconfigs",
    ],
    tags = ["cpu:4"],
    deps = [
        "//projects/batfish-common-protocol:common",
        "//projects/batfish",
        "@maven//:com_google_code_findbugs_jsr305",
        "@maven//:com_google_guava_guava",
        "@maven//:junit_junit",
        "@maven//:org_hamcrest_hamcrest",
    ],
)
