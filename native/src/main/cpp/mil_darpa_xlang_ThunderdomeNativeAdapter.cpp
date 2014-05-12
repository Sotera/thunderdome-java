#include <jni.h>
#include <iostream>
#include "mil_darpa_xlang_ThunderdomeNative.h"
using namespace std;

extern "C" JNIEXPORT jobject JNICALL Java_mil_darpa_xlang_ThunderdomeNativeAdapter_invoke__Ljava_lang_String_2
(JNIEnv* env, jobject obj, jstring function) {
    jint hardCodedResult = 0;

    jclass tdValueFactoryClass = env->FindClass("mil/darpa/xlang/TdValueFactory");
    jmethodID tdValueFactoryMethod = env->GetStaticMethodID(tdValueFactoryClass, "newTdValue", "(Ljava/lang/Object;)Lmil/darpa/xlang/TdValue;");


    jclass integerClass = env->FindClass("java/lang/Integer");
    jmethodID newInteger = env->GetMethodID(integerClass, "<init>", "(I)V");
    jobject value = env->NewObject(integerClass, newInteger, hardCodedResult);

    return env->CallStaticObjectMethod(integerClass, tdValueFactoryMethod, value);
}

extern "C" JNIEXPORT jobject JNICALL Java_mil_darpa_xlang_ThunderdomeNativeAdapter_invoke__Ljava_lang_String_2Lmil_darpa_xlang_TdValue_2
(JNIEnv* env, jobject obj, jstring function, jobject arg1) {
    jint hardCodedResult = 1;

    jclass tdValueFactoryClass = env->FindClass("mil/darpa/xlang/TdValueFactory");
    jmethodID tdValueFactoryMethod = env->GetStaticMethodID(tdValueFactoryClass, "newTdValue", "(Ljava/lang/Object;)Lmil/darpa/xlang/TdValue;");


    jclass integerClass = env->FindClass("java/lang/Integer");
    jmethodID newInteger = env->GetMethodID(integerClass, "<init>", "(I)V");

    jobject value = env->NewObject(integerClass, newInteger, hardCodedResult);

    return env->CallStaticObjectMethod(integerClass, tdValueFactoryMethod, value);
}

extern "C" JNIEXPORT jobject JNICALL Java_mil_darpa_xlang_ThunderdomeNativeAdapter_invoke__Ljava_lang_String_2Lmil_darpa_xlang_TdValue_2Lmil_darpa_xlang_TdValue_2
(JNIEnv* env, jobject obj, jstring function, jobject arg1, jobject arg2) {
    jint hardCodedResult = 2;

    jclass tdValueFactoryClass = env->FindClass("mil/darpa/xlang/TdValueFactory");
    jmethodID tdValueFactoryMethod = env->GetStaticMethodID(tdValueFactoryClass, "newTdValue", "(Ljava/lang/Object;)Lmil/darpa/xlang/TdValue;");


    jclass integerClass = env->FindClass("java/lang/Integer");
    jmethodID newInteger = env->GetMethodID(integerClass, "<init>", "(I)V");
    jobject value = env->NewObject(integerClass, newInteger, hardCodedResult);

    return env->CallStaticObjectMethod(integerClass, tdValueFactoryMethod, value);
}
