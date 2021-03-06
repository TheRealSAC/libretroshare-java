/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * This file is not intended to be easily readable and contains a number of
 * coding conventions designed to improve portability and efficiency. Do not make
 * changes to this file unless you know what you are doing--modify the SWIG
 * interface file instead.
 * ----------------------------------------------------------------------------- */

#define SWIGJAVA


#ifdef __cplusplus
/* SwigValueWrapper is described in swig.swg */
template<typename T> class SwigValueWrapper {
  struct SwigMovePointer {
    T *ptr;
    SwigMovePointer(T *p) : ptr(p) { }
    ~SwigMovePointer() { delete ptr; }
    SwigMovePointer& operator=(SwigMovePointer& rhs) { T* oldptr = ptr; ptr = 0; delete oldptr; ptr = rhs.ptr; rhs.ptr = 0; return *this; }
  } pointer;
  SwigValueWrapper& operator=(const SwigValueWrapper<T>& rhs);
  SwigValueWrapper(const SwigValueWrapper<T>& rhs);
public:
  SwigValueWrapper() : pointer(0) { }
  SwigValueWrapper& operator=(const T& t) { SwigMovePointer tmp(new T(t)); pointer = tmp; return *this; }
  operator T&() const { return *pointer.ptr; }
  T *operator&() { return pointer.ptr; }
};

template <typename T> T SwigValueInit() {
  return T();
}
#endif

/* -----------------------------------------------------------------------------
 *  This section contains generic SWIG labels for method/variable
 *  declarations/attributes, and other compiler dependent labels.
 * ----------------------------------------------------------------------------- */

/* template workaround for compilers that cannot correctly implement the C++ standard */
#ifndef SWIGTEMPLATEDISAMBIGUATOR
# if defined(__SUNPRO_CC) && (__SUNPRO_CC <= 0x560)
#  define SWIGTEMPLATEDISAMBIGUATOR template
# elif defined(__HP_aCC)
/* Needed even with `aCC -AA' when `aCC -V' reports HP ANSI C++ B3910B A.03.55 */
/* If we find a maximum version that requires this, the test would be __HP_aCC <= 35500 for A.03.55 */
#  define SWIGTEMPLATEDISAMBIGUATOR template
# else
#  define SWIGTEMPLATEDISAMBIGUATOR
# endif
#endif

/* inline attribute */
#ifndef SWIGINLINE
# if defined(__cplusplus) || (defined(__GNUC__) && !defined(__STRICT_ANSI__))
#   define SWIGINLINE inline
# else
#   define SWIGINLINE
# endif
#endif

/* attribute recognised by some compilers to avoid 'unused' warnings */
#ifndef SWIGUNUSED
# if defined(__GNUC__)
#   if !(defined(__cplusplus)) || (__GNUC__ > 3 || (__GNUC__ == 3 && __GNUC_MINOR__ >= 4))
#     define SWIGUNUSED __attribute__ ((__unused__))
#   else
#     define SWIGUNUSED
#   endif
# elif defined(__ICC)
#   define SWIGUNUSED __attribute__ ((__unused__))
# else
#   define SWIGUNUSED
# endif
#endif

#ifndef SWIG_MSC_UNSUPPRESS_4505
# if defined(_MSC_VER)
#   pragma warning(disable : 4505) /* unreferenced local function has been removed */
# endif
#endif

#ifndef SWIGUNUSEDPARM
# ifdef __cplusplus
#   define SWIGUNUSEDPARM(p)
# else
#   define SWIGUNUSEDPARM(p) p SWIGUNUSED
# endif
#endif

/* internal SWIG method */
#ifndef SWIGINTERN
# define SWIGINTERN static SWIGUNUSED
#endif

/* internal inline SWIG method */
#ifndef SWIGINTERNINLINE
# define SWIGINTERNINLINE SWIGINTERN SWIGINLINE
#endif

/* exporting methods */
#if (__GNUC__ >= 4) || (__GNUC__ == 3 && __GNUC_MINOR__ >= 4)
#  ifndef GCC_HASCLASSVISIBILITY
#    define GCC_HASCLASSVISIBILITY
#  endif
#endif

#ifndef SWIGEXPORT
# if defined(_WIN32) || defined(__WIN32__) || defined(__CYGWIN__)
#   if defined(STATIC_LINKED)
#     define SWIGEXPORT
#   else
#     define SWIGEXPORT __declspec(dllexport)
#   endif
# else
#   if defined(__GNUC__) && defined(GCC_HASCLASSVISIBILITY)
#     define SWIGEXPORT __attribute__ ((visibility("default")))
#   else
#     define SWIGEXPORT
#   endif
# endif
#endif

/* calling conventions for Windows */
#ifndef SWIGSTDCALL
# if defined(_WIN32) || defined(__WIN32__) || defined(__CYGWIN__)
#   define SWIGSTDCALL __stdcall
# else
#   define SWIGSTDCALL
# endif
#endif

/* Deal with Microsoft's attempt at deprecating C standard runtime functions */
#if !defined(SWIG_NO_CRT_SECURE_NO_DEPRECATE) && defined(_MSC_VER) && !defined(_CRT_SECURE_NO_DEPRECATE)
# define _CRT_SECURE_NO_DEPRECATE
#endif

/* Deal with Microsoft's attempt at deprecating methods in the standard C++ library */
#if !defined(SWIG_NO_SCL_SECURE_NO_DEPRECATE) && defined(_MSC_VER) && !defined(_SCL_SECURE_NO_DEPRECATE)
# define _SCL_SECURE_NO_DEPRECATE
#endif



/* Fix for jlong on some versions of gcc on Windows */
#if defined(__GNUC__) && !defined(__INTEL_COMPILER)
  typedef long long __int64;
#endif

/* Fix for jlong on 64-bit x86 Solaris */
#if defined(__x86_64)
# ifdef _LP64
#   undef _LP64
# endif
#endif

#include <jni.h>
#include <stdlib.h>
#include <string.h>


/* Support for throwing Java exceptions */
typedef enum {
  SWIG_JavaOutOfMemoryError = 1, 
  SWIG_JavaIOException, 
  SWIG_JavaRuntimeException, 
  SWIG_JavaIndexOutOfBoundsException,
  SWIG_JavaArithmeticException,
  SWIG_JavaIllegalArgumentException,
  SWIG_JavaNullPointerException,
  SWIG_JavaDirectorPureVirtual,
  SWIG_JavaUnknownError
} SWIG_JavaExceptionCodes;

typedef struct {
  SWIG_JavaExceptionCodes code;
  const char *java_exception;
} SWIG_JavaExceptions_t;


static void SWIGUNUSED SWIG_JavaThrowException(JNIEnv *jenv, SWIG_JavaExceptionCodes code, const char *msg) {
  jclass excep;
  static const SWIG_JavaExceptions_t java_exceptions[] = {
    { SWIG_JavaOutOfMemoryError, "java/lang/OutOfMemoryError" },
    { SWIG_JavaIOException, "java/io/IOException" },
    { SWIG_JavaRuntimeException, "java/lang/RuntimeException" },
    { SWIG_JavaIndexOutOfBoundsException, "java/lang/IndexOutOfBoundsException" },
    { SWIG_JavaArithmeticException, "java/lang/ArithmeticException" },
    { SWIG_JavaIllegalArgumentException, "java/lang/IllegalArgumentException" },
    { SWIG_JavaNullPointerException, "java/lang/NullPointerException" },
    { SWIG_JavaDirectorPureVirtual, "java/lang/RuntimeException" },
    { SWIG_JavaUnknownError,  "java/lang/UnknownError" },
    { (SWIG_JavaExceptionCodes)0,  "java/lang/UnknownError" }
  };
  const SWIG_JavaExceptions_t *except_ptr = java_exceptions;

  while (except_ptr->code != code && except_ptr->code)
    except_ptr++;

  jenv->ExceptionClear();
  excep = jenv->FindClass(except_ptr->java_exception);
  if (excep)
    jenv->ThrowNew(excep, msg);
}


/* Contract support */

#define SWIG_contract_assert(nullreturn, expr, msg) if (!(expr)) {SWIG_JavaThrowException(jenv, SWIG_JavaIllegalArgumentException, msg); return nullreturn; } else


#ifdef __cplusplus
extern "C" {
#endif

SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_rsNotify_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  RsNotify *arg1 = (RsNotify *) 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsNotify **)&jarg1; 
  rsNotify = arg1;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_rsNotify_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  RsNotify *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  result = (RsNotify *)rsNotify;
  *(RsNotify **)&jresult = result; 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1SYS_1ERROR_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_SYS_ERROR;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1SYS_1WARNING_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_SYS_WARNING;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1SYS_1INFO_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_SYS_INFO;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1POPUP_1MSG_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_POPUP_MSG;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1POPUP_1CHAT_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_POPUP_CHAT;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1POPUP_1CONNECT_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_POPUP_CONNECT;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1SYSTRAY_1GROUP_1MSG_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_SYSTRAY_GROUP_MSG;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1POPUP_1DOWNLOAD_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_POPUP_DOWNLOAD;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1POPUP_1GROUPCHAT_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_POPUP_GROUPCHAT;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1POPUP_1CHATLOBBY_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_POPUP_CHATLOBBY;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1POPUP_1CONNECT_1ATTEMPT_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_POPUP_CONNECT_ATTEMPT;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1POPUP_1ENCRYPTED_1MSG_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_POPUP_ENCRYPTED_MSG;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1CHAT_1OPEN_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_CHAT_OPEN;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1CHAT_1FOCUS_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_CHAT_FOCUS;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1CHAT_1TABBED_1WINDOW_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_CHAT_TABBED_WINDOW;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1CHAT_1BLINK_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_CHAT_BLINK;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1TYPE_1PEER_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_TYPE_PEER;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1TYPE_1CHAN_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_TYPE_CHAN;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1TYPE_1FORUM_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_TYPE_FORUM;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1TYPE_1BLOG_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_TYPE_BLOG;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1TYPE_1CHAT_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_TYPE_CHAT;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1TYPE_1MSG_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_TYPE_MSG;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1TYPE_1FILES_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_TYPE_FILES;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1TYPE_1SECURITY_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_TYPE_SECURITY;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1ITEM_1PEER_1CONNECT_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_ITEM_PEER_CONNECT;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1ITEM_1PEER_1DISCONNECT_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_ITEM_PEER_DISCONNECT;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1ITEM_1PEER_1HELLO_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_ITEM_PEER_HELLO;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1ITEM_1PEER_1NEW_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_ITEM_PEER_NEW;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1ITEM_1SEC_1CONNECT_1ATTEMPT_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_ITEM_SEC_CONNECT_ATTEMPT;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1ITEM_1SEC_1AUTH_1DENIED_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_ITEM_SEC_AUTH_DENIED;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1ITEM_1SEC_1UNKNOWN_1IN_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_ITEM_SEC_UNKNOWN_IN;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1ITEM_1SEC_1UNKNOWN_1OUT_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_ITEM_SEC_UNKNOWN_OUT;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1ITEM_1CHAN_1NEW_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_ITEM_CHAN_NEW;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1ITEM_1CHAN_1UPDATE_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_ITEM_CHAN_UPDATE;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1ITEM_1CHAN_1MSG_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_ITEM_CHAN_MSG;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1ITEM_1FORUM_1NEW_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_ITEM_FORUM_NEW;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1ITEM_1FORUM_1UPDATE_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_ITEM_FORUM_UPDATE;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1ITEM_1FORUM_1MSG_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_ITEM_FORUM_MSG;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1ITEM_1BLOG_1NEW_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_ITEM_BLOG_NEW;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1ITEM_1BLOG_1UPDATE_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_ITEM_BLOG_UPDATE;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1ITEM_1BLOG_1MSG_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_ITEM_BLOG_MSG;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1ITEM_1CHAT_1NEW_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_ITEM_CHAT_NEW;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1ITEM_1MESSAGE_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_ITEM_MESSAGE;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1FEED_1ITEM_1FILES_1NEW_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_FEED_ITEM_FILES_NEW;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1MESSAGE_1CONNECT_1ATTEMPT_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_MESSAGE_CONNECT_ATTEMPT;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_new_1RsFeedItem_1_1SWIG_10(JNIEnv *jenv, jclass jcls, jlong jarg1, jlong jarg2, jlong jarg3, jlong jarg4) {
  jlong jresult = 0 ;
  uint32_t arg1 ;
  std::string *arg2 = 0 ;
  std::string *arg3 = 0 ;
  std::string *arg4 = 0 ;
  uint32_t *argp1 ;
  RsFeedItem *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  argp1 = *(uint32_t **)&jarg1; 
  if (!argp1) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint32_t");
    return 0;
  }
  arg1 = *argp1; 
  arg2 = *(std::string **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::string const & reference is null");
    return 0;
  } 
  arg3 = *(std::string **)&jarg3;
  if (!arg3) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::string const & reference is null");
    return 0;
  } 
  arg4 = *(std::string **)&jarg4;
  if (!arg4) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::string const & reference is null");
    return 0;
  } 
  result = (RsFeedItem *)new RsFeedItem(arg1,(std::string const &)*arg2,(std::string const &)*arg3,(std::string const &)*arg4);
  *(RsFeedItem **)&jresult = result; 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_new_1RsFeedItem_1_1SWIG_11(JNIEnv *jenv, jclass jcls, jlong jarg1, jlong jarg2, jlong jarg3, jlong jarg4, jlong jarg5) {
  jlong jresult = 0 ;
  uint32_t arg1 ;
  std::string *arg2 = 0 ;
  std::string *arg3 = 0 ;
  std::string *arg4 = 0 ;
  std::string *arg5 = 0 ;
  uint32_t *argp1 ;
  RsFeedItem *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  argp1 = *(uint32_t **)&jarg1; 
  if (!argp1) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint32_t");
    return 0;
  }
  arg1 = *argp1; 
  arg2 = *(std::string **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::string const & reference is null");
    return 0;
  } 
  arg3 = *(std::string **)&jarg3;
  if (!arg3) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::string const & reference is null");
    return 0;
  } 
  arg4 = *(std::string **)&jarg4;
  if (!arg4) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::string const & reference is null");
    return 0;
  } 
  arg5 = *(std::string **)&jarg5;
  if (!arg5) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::string const & reference is null");
    return 0;
  } 
  result = (RsFeedItem *)new RsFeedItem(arg1,(std::string const &)*arg2,(std::string const &)*arg3,(std::string const &)*arg4,(std::string const &)*arg5);
  *(RsFeedItem **)&jresult = result; 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_new_1RsFeedItem_1_1SWIG_12(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  RsFeedItem *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  result = (RsFeedItem *)new RsFeedItem();
  *(RsFeedItem **)&jresult = result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsFeedItem_1mType_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  RsFeedItem *arg1 = (RsFeedItem *) 0 ;
  uint32_t arg2 ;
  uint32_t *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsFeedItem **)&jarg1; 
  argp2 = *(uint32_t **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint32_t");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->mType = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RsFeedItem_1mType_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  RsFeedItem *arg1 = (RsFeedItem *) 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsFeedItem **)&jarg1; 
  result =  ((arg1)->mType);
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsFeedItem_1mId1_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  RsFeedItem *arg1 = (RsFeedItem *) 0 ;
  std::string arg2 ;
  std::string *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsFeedItem **)&jarg1; 
  argp2 = *(std::string **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null std::string");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->mId1 = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RsFeedItem_1mId1_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  RsFeedItem *arg1 = (RsFeedItem *) 0 ;
  std::string result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsFeedItem **)&jarg1; 
  result =  ((arg1)->mId1);
  *(std::string **)&jresult = new std::string((const std::string &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsFeedItem_1mId2_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  RsFeedItem *arg1 = (RsFeedItem *) 0 ;
  std::string arg2 ;
  std::string *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsFeedItem **)&jarg1; 
  argp2 = *(std::string **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null std::string");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->mId2 = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RsFeedItem_1mId2_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  RsFeedItem *arg1 = (RsFeedItem *) 0 ;
  std::string result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsFeedItem **)&jarg1; 
  result =  ((arg1)->mId2);
  *(std::string **)&jresult = new std::string((const std::string &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsFeedItem_1mId3_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  RsFeedItem *arg1 = (RsFeedItem *) 0 ;
  std::string arg2 ;
  std::string *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsFeedItem **)&jarg1; 
  argp2 = *(std::string **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null std::string");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->mId3 = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RsFeedItem_1mId3_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  RsFeedItem *arg1 = (RsFeedItem *) 0 ;
  std::string result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsFeedItem **)&jarg1; 
  result =  ((arg1)->mId3);
  *(std::string **)&jresult = new std::string((const std::string &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsFeedItem_1mId4_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  RsFeedItem *arg1 = (RsFeedItem *) 0 ;
  std::string arg2 ;
  std::string *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsFeedItem **)&jarg1; 
  argp2 = *(std::string **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null std::string");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->mId4 = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RsFeedItem_1mId4_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  RsFeedItem *arg1 = (RsFeedItem *) 0 ;
  std::string result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsFeedItem **)&jarg1; 
  result =  ((arg1)->mId4);
  *(std::string **)&jresult = new std::string((const std::string &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_delete_1RsFeedItem(JNIEnv *jenv, jclass jcls, jlong jarg1) {
  RsFeedItem *arg1 = (RsFeedItem *) 0 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = *(RsFeedItem **)&jarg1; 
  delete arg1;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_delete_1RsNotify(JNIEnv *jenv, jclass jcls, jlong jarg1) {
  RsNotify *arg1 = (RsNotify *) 0 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = *(RsNotify **)&jarg1; 
  delete arg1;
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsNotify_1NotifySysMessage(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jlong jarg3, jlong jarg4, jlong jarg5) {
  jboolean jresult = 0 ;
  RsNotify *arg1 = (RsNotify *) 0 ;
  uint32_t *arg2 = 0 ;
  uint32_t *arg3 = 0 ;
  std::string *arg4 = 0 ;
  std::string *arg5 = 0 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsNotify **)&jarg1; 
  arg2 = *(uint32_t **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "uint32_t & reference is null");
    return 0;
  } 
  arg3 = *(uint32_t **)&jarg3;
  if (!arg3) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "uint32_t & reference is null");
    return 0;
  } 
  arg4 = *(std::string **)&jarg4;
  if (!arg4) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::string & reference is null");
    return 0;
  } 
  arg5 = *(std::string **)&jarg5;
  if (!arg5) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::string & reference is null");
    return 0;
  } 
  result = (bool)(arg1)->NotifySysMessage(*arg2,*arg3,*arg4,*arg5);
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsNotify_1NotifyPopupMessage(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jlong jarg3, jlong jarg4, jlong jarg5) {
  jboolean jresult = 0 ;
  RsNotify *arg1 = (RsNotify *) 0 ;
  uint32_t *arg2 = 0 ;
  std::string *arg3 = 0 ;
  std::string *arg4 = 0 ;
  std::string *arg5 = 0 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsNotify **)&jarg1; 
  arg2 = *(uint32_t **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "uint32_t & reference is null");
    return 0;
  } 
  arg3 = *(std::string **)&jarg3;
  if (!arg3) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::string & reference is null");
    return 0;
  } 
  arg4 = *(std::string **)&jarg4;
  if (!arg4) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::string & reference is null");
    return 0;
  } 
  arg5 = *(std::string **)&jarg5;
  if (!arg5) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::string & reference is null");
    return 0;
  } 
  result = (bool)(arg1)->NotifyPopupMessage(*arg2,*arg3,*arg4,*arg5);
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsNotify_1NotifyLogMessage(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jlong jarg3, jlong jarg4, jlong jarg5) {
  jboolean jresult = 0 ;
  RsNotify *arg1 = (RsNotify *) 0 ;
  uint32_t *arg2 = 0 ;
  uint32_t *arg3 = 0 ;
  std::string *arg4 = 0 ;
  std::string *arg5 = 0 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsNotify **)&jarg1; 
  arg2 = *(uint32_t **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "uint32_t & reference is null");
    return 0;
  } 
  arg3 = *(uint32_t **)&jarg3;
  if (!arg3) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "uint32_t & reference is null");
    return 0;
  } 
  arg4 = *(std::string **)&jarg4;
  if (!arg4) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::string & reference is null");
    return 0;
  } 
  arg5 = *(std::string **)&jarg5;
  if (!arg5) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::string & reference is null");
    return 0;
  } 
  result = (bool)(arg1)->NotifyLogMessage(*arg2,*arg3,*arg4,*arg5);
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsNotify_1GetSysMessageList(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  jboolean jresult = 0 ;
  RsNotify *arg1 = (RsNotify *) 0 ;
  std::map< uint32_t,std::string > *arg2 = 0 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsNotify **)&jarg1; 
  arg2 = *(std::map< uint32_t,std::string > **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::map< uint32_t,std::string > & reference is null");
    return 0;
  } 
  result = (bool)(arg1)->GetSysMessageList(*arg2);
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsNotify_1GetPopupMessageList(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  jboolean jresult = 0 ;
  RsNotify *arg1 = (RsNotify *) 0 ;
  std::map< uint32_t,std::string > *arg2 = 0 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsNotify **)&jarg1; 
  arg2 = *(std::map< uint32_t,std::string > **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::map< uint32_t,std::string > & reference is null");
    return 0;
  } 
  result = (bool)(arg1)->GetPopupMessageList(*arg2);
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsNotify_1SetSysMessageMode(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jlong jarg3) {
  jboolean jresult = 0 ;
  RsNotify *arg1 = (RsNotify *) 0 ;
  uint32_t arg2 ;
  uint32_t arg3 ;
  uint32_t *argp2 ;
  uint32_t *argp3 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsNotify **)&jarg1; 
  argp2 = *(uint32_t **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint32_t");
    return 0;
  }
  arg2 = *argp2; 
  argp3 = *(uint32_t **)&jarg3; 
  if (!argp3) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint32_t");
    return 0;
  }
  arg3 = *argp3; 
  result = (bool)(arg1)->SetSysMessageMode(arg2,arg3);
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsNotify_1SetPopupMessageMode(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jlong jarg3) {
  jboolean jresult = 0 ;
  RsNotify *arg1 = (RsNotify *) 0 ;
  uint32_t arg2 ;
  uint32_t arg3 ;
  uint32_t *argp2 ;
  uint32_t *argp3 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsNotify **)&jarg1; 
  argp2 = *(uint32_t **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint32_t");
    return 0;
  }
  arg2 = *argp2; 
  argp3 = *(uint32_t **)&jarg3; 
  if (!argp3) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint32_t");
    return 0;
  }
  arg3 = *argp3; 
  result = (bool)(arg1)->SetPopupMessageMode(arg2,arg3);
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsNotify_1GetFeedItem(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jobject jarg2_) {
  jboolean jresult = 0 ;
  RsNotify *arg1 = (RsNotify *) 0 ;
  RsFeedItem *arg2 = 0 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  (void)jarg2_;
  arg1 = *(RsNotify **)&jarg1; 
  arg2 = *(RsFeedItem **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "RsFeedItem & reference is null");
    return 0;
  } 
  result = (bool)(arg1)->GetFeedItem(*arg2);
  jresult = (jboolean)result; 
  return jresult;
}


#ifdef __cplusplus
}
#endif

