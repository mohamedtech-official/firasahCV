#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_mohamedtech_firasah_Firasah_00024Companion_WelcomeMessage(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF("Welcome to FirasahCV");
}