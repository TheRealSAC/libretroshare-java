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

SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_rsHistory_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  RsHistory *arg1 = (RsHistory *) 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsHistory **)&jarg1; 
  rsHistory = arg1;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_rsHistory_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  RsHistory *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  result = (RsHistory *)rsHistory;
  *(RsHistory **)&jresult = result; 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1HISTORY_1TYPE_1PUBLIC_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_HISTORY_TYPE_PUBLIC;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1HISTORY_1TYPE_1PRIVATE_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_HISTORY_TYPE_PRIVATE;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RS_1HISTORY_1TYPE_1LOBBY_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  result = (uint32_t)RS_HISTORY_TYPE_LOBBY;
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_new_1HistoryMsg(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  HistoryMsg *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  result = (HistoryMsg *)new HistoryMsg();
  *(HistoryMsg **)&jresult = result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_HistoryMsg_1msgId_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  HistoryMsg *arg1 = (HistoryMsg *) 0 ;
  uint32_t arg2 ;
  uint32_t *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(HistoryMsg **)&jarg1; 
  argp2 = *(uint32_t **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint32_t");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->msgId = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_HistoryMsg_1msgId_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  HistoryMsg *arg1 = (HistoryMsg *) 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(HistoryMsg **)&jarg1; 
  result =  ((arg1)->msgId);
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_HistoryMsg_1chatPeerId_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  HistoryMsg *arg1 = (HistoryMsg *) 0 ;
  std::string arg2 ;
  std::string *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(HistoryMsg **)&jarg1; 
  argp2 = *(std::string **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null std::string");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->chatPeerId = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_HistoryMsg_1chatPeerId_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  HistoryMsg *arg1 = (HistoryMsg *) 0 ;
  std::string result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(HistoryMsg **)&jarg1; 
  result =  ((arg1)->chatPeerId);
  *(std::string **)&jresult = new std::string((const std::string &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_HistoryMsg_1incoming_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jboolean jarg2) {
  HistoryMsg *arg1 = (HistoryMsg *) 0 ;
  bool arg2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(HistoryMsg **)&jarg1; 
  arg2 = jarg2 ? true : false; 
  if (arg1) (arg1)->incoming = arg2;
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_HistoryMsg_1incoming_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jboolean jresult = 0 ;
  HistoryMsg *arg1 = (HistoryMsg *) 0 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(HistoryMsg **)&jarg1; 
  result = (bool) ((arg1)->incoming);
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_HistoryMsg_1peerId_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  HistoryMsg *arg1 = (HistoryMsg *) 0 ;
  std::string arg2 ;
  std::string *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(HistoryMsg **)&jarg1; 
  argp2 = *(std::string **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null std::string");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->peerId = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_HistoryMsg_1peerId_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  HistoryMsg *arg1 = (HistoryMsg *) 0 ;
  std::string result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(HistoryMsg **)&jarg1; 
  result =  ((arg1)->peerId);
  *(std::string **)&jresult = new std::string((const std::string &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_HistoryMsg_1peerName_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  HistoryMsg *arg1 = (HistoryMsg *) 0 ;
  std::string arg2 ;
  std::string *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(HistoryMsg **)&jarg1; 
  argp2 = *(std::string **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null std::string");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->peerName = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_HistoryMsg_1peerName_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  HistoryMsg *arg1 = (HistoryMsg *) 0 ;
  std::string result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(HistoryMsg **)&jarg1; 
  result =  ((arg1)->peerName);
  *(std::string **)&jresult = new std::string((const std::string &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_HistoryMsg_1sendTime_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  HistoryMsg *arg1 = (HistoryMsg *) 0 ;
  uint32_t arg2 ;
  uint32_t *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(HistoryMsg **)&jarg1; 
  argp2 = *(uint32_t **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint32_t");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->sendTime = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_HistoryMsg_1sendTime_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  HistoryMsg *arg1 = (HistoryMsg *) 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(HistoryMsg **)&jarg1; 
  result =  ((arg1)->sendTime);
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_HistoryMsg_1recvTime_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  HistoryMsg *arg1 = (HistoryMsg *) 0 ;
  uint32_t arg2 ;
  uint32_t *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(HistoryMsg **)&jarg1; 
  argp2 = *(uint32_t **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint32_t");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->recvTime = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_HistoryMsg_1recvTime_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  HistoryMsg *arg1 = (HistoryMsg *) 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(HistoryMsg **)&jarg1; 
  result =  ((arg1)->recvTime);
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_HistoryMsg_1message_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  HistoryMsg *arg1 = (HistoryMsg *) 0 ;
  std::string arg2 ;
  std::string *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(HistoryMsg **)&jarg1; 
  argp2 = *(std::string **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null std::string");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->message = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_HistoryMsg_1message_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  HistoryMsg *arg1 = (HistoryMsg *) 0 ;
  std::string result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(HistoryMsg **)&jarg1; 
  result =  ((arg1)->message);
  *(std::string **)&jresult = new std::string((const std::string &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_delete_1HistoryMsg(JNIEnv *jenv, jclass jcls, jlong jarg1) {
  HistoryMsg *arg1 = (HistoryMsg *) 0 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = *(HistoryMsg **)&jarg1; 
  delete arg1;
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsHistory_1getMessages(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jlong jarg3, jlong jarg4) {
  jboolean jresult = 0 ;
  RsHistory *arg1 = (RsHistory *) 0 ;
  std::string *arg2 = 0 ;
  std::list< HistoryMsg > *arg3 = 0 ;
  uint32_t arg4 ;
  uint32_t *argp4 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsHistory **)&jarg1; 
  arg2 = *(std::string **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::string const & reference is null");
    return 0;
  } 
  arg3 = *(std::list< HistoryMsg > **)&jarg3;
  if (!arg3) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::list< HistoryMsg > & reference is null");
    return 0;
  } 
  argp4 = *(uint32_t **)&jarg4; 
  if (!argp4) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint32_t");
    return 0;
  }
  arg4 = *argp4; 
  result = (bool)(arg1)->getMessages((std::string const &)*arg2,*arg3,arg4);
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsHistory_1getMessage(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jlong jarg3, jobject jarg3_) {
  jboolean jresult = 0 ;
  RsHistory *arg1 = (RsHistory *) 0 ;
  uint32_t arg2 ;
  HistoryMsg *arg3 = 0 ;
  uint32_t *argp2 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  (void)jarg3_;
  arg1 = *(RsHistory **)&jarg1; 
  argp2 = *(uint32_t **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint32_t");
    return 0;
  }
  arg2 = *argp2; 
  arg3 = *(HistoryMsg **)&jarg3;
  if (!arg3) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "HistoryMsg & reference is null");
    return 0;
  } 
  result = (bool)(arg1)->getMessage(arg2,*arg3);
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsHistory_1removeMessages(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  RsHistory *arg1 = (RsHistory *) 0 ;
  std::list< uint32_t > *arg2 = 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsHistory **)&jarg1; 
  arg2 = *(std::list< uint32_t > **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::list< uint32_t > const & reference is null");
    return ;
  } 
  (arg1)->removeMessages((std::list< uint32_t > const &)*arg2);
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsHistory_1clear(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  RsHistory *arg1 = (RsHistory *) 0 ;
  std::string *arg2 = 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsHistory **)&jarg1; 
  arg2 = *(std::string **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::string const & reference is null");
    return ;
  } 
  (arg1)->clear((std::string const &)*arg2);
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsHistory_1getEnable(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  jboolean jresult = 0 ;
  RsHistory *arg1 = (RsHistory *) 0 ;
  uint32_t arg2 ;
  uint32_t *argp2 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsHistory **)&jarg1; 
  argp2 = *(uint32_t **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint32_t");
    return 0;
  }
  arg2 = *argp2; 
  result = (bool)(arg1)->getEnable(arg2);
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsHistory_1setEnable(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jboolean jarg3) {
  RsHistory *arg1 = (RsHistory *) 0 ;
  uint32_t arg2 ;
  bool arg3 ;
  uint32_t *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsHistory **)&jarg1; 
  argp2 = *(uint32_t **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint32_t");
    return ;
  }
  arg2 = *argp2; 
  arg3 = jarg3 ? true : false; 
  (arg1)->setEnable(arg2,arg3);
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RsHistory_1getMaxStorageDuration(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  RsHistory *arg1 = (RsHistory *) 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsHistory **)&jarg1; 
  result = (arg1)->getMaxStorageDuration();
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsHistory_1setMaxStorageDuration(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  RsHistory *arg1 = (RsHistory *) 0 ;
  uint32_t arg2 ;
  uint32_t *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsHistory **)&jarg1; 
  argp2 = *(uint32_t **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint32_t");
    return ;
  }
  arg2 = *argp2; 
  (arg1)->setMaxStorageDuration(arg2);
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RsHistory_1getSaveCount(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  jlong jresult = 0 ;
  RsHistory *arg1 = (RsHistory *) 0 ;
  uint32_t arg2 ;
  uint32_t *argp2 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsHistory **)&jarg1; 
  argp2 = *(uint32_t **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint32_t");
    return 0;
  }
  arg2 = *argp2; 
  result = (arg1)->getSaveCount(arg2);
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsHistory_1setSaveCount(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jlong jarg3) {
  RsHistory *arg1 = (RsHistory *) 0 ;
  uint32_t arg2 ;
  uint32_t arg3 ;
  uint32_t *argp2 ;
  uint32_t *argp3 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsHistory **)&jarg1; 
  argp2 = *(uint32_t **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint32_t");
    return ;
  }
  arg2 = *argp2; 
  argp3 = *(uint32_t **)&jarg3; 
  if (!argp3) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint32_t");
    return ;
  }
  arg3 = *argp3; 
  (arg1)->setSaveCount(arg2,arg3);
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_delete_1RsHistory(JNIEnv *jenv, jclass jcls, jlong jarg1) {
  RsHistory *arg1 = (RsHistory *) 0 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = *(RsHistory **)&jarg1; 
  delete arg1;
}


#ifdef __cplusplus
}
#endif

