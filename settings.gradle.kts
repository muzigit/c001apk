pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
         // JitPack 远程仓库：https://jitpack.io
        maven(url="https://jitpack.io")
        // 阿里云云效仓库：https://maven.aliyun.com/mvn/guide
        maven(url="https://maven.aliyun.com/repository/central" )
        maven(url="https://maven.aliyun.com/repository/public" )
        maven(url="https://maven.aliyun.com/repository/google" )
        // 华为开源镜像：https://mirrors.huaweicloud.com
        maven(url="https://repo.huaweicloud.com/repository/maven")

        // banner开源库 仓库
        maven(url="https://s01.oss.sonatype.org/content/groups/public")

        // 配置华为运动健康SDK的Maven仓库地址
        // https://developer.huawei.com/consumer/cn/doc/huaweihealth-Guides/integrating-sdk-0000001209916572#section1453441512308
        maven(url="https://developer.huawei.com/repo/" )
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven ("https://jitpack.io")
        maven("https://oss.sonatype.org/content/repositories/public")
        gradlePluginPortal()
         // JitPack 远程仓库：https://jitpack.io
        maven(url="https://jitpack.io")
        // 阿里云云效仓库：https://maven.aliyun.com/mvn/guide
        maven(url="https://maven.aliyun.com/repository/central" )
        maven(url="https://maven.aliyun.com/repository/public" )
        maven(url="https://maven.aliyun.com/repository/google" )
        // 华为开源镜像：https://mirrors.huaweicloud.com
        maven(url="https://repo.huaweicloud.com/repository/maven")

        // banner开源库 仓库
        maven(url="https://s01.oss.sonatype.org/content/groups/public")

        // 配置华为运动健康SDK的Maven仓库地址
        // https://developer.huawei.com/consumer/cn/doc/huaweihealth-Guides/integrating-sdk-0000001209916572#section1453441512308
        maven(url="https://developer.huawei.com/repo/" )
    }
}

rootProject.name = "c001apk"
include(":app", ":mojito", ":SketchImageViewLoader", ":GlideImageLoader")
 
