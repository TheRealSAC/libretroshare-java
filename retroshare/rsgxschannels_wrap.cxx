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

SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_rsGxsChannels_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  RsGxsChannels *arg1 = (RsGxsChannels *) 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannels **)&jarg1; 
  rsGxsChannels = arg1;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_rsGxsChannels_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  RsGxsChannels *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  result = (RsGxsChannels *)rsGxsChannels;
  *(RsGxsChannels **)&jresult = result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannelGroup_1mMeta_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  RsGxsChannelGroup *arg1 = (RsGxsChannelGroup *) 0 ;
  RsGroupMetaData arg2 ;
  RsGroupMetaData *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannelGroup **)&jarg1; 
  argp2 = *(RsGroupMetaData **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null RsGroupMetaData");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->mMeta = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannelGroup_1mMeta_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  RsGxsChannelGroup *arg1 = (RsGxsChannelGroup *) 0 ;
  RsGroupMetaData result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannelGroup **)&jarg1; 
  result =  ((arg1)->mMeta);
  *(RsGroupMetaData **)&jresult = new RsGroupMetaData((const RsGroupMetaData &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannelGroup_1mDescription_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  RsGxsChannelGroup *arg1 = (RsGxsChannelGroup *) 0 ;
  std::string arg2 ;
  std::string *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannelGroup **)&jarg1; 
  argp2 = *(std::string **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null std::string");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->mDescription = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannelGroup_1mDescription_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  RsGxsChannelGroup *arg1 = (RsGxsChannelGroup *) 0 ;
  std::string result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannelGroup **)&jarg1; 
  result =  ((arg1)->mDescription);
  *(std::string **)&jresult = new std::string((const std::string &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannelGroup_1mImage_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  RsGxsChannelGroup *arg1 = (RsGxsChannelGroup *) 0 ;
  RsGxsImage arg2 ;
  RsGxsImage *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannelGroup **)&jarg1; 
  argp2 = *(RsGxsImage **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null RsGxsImage");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->mImage = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannelGroup_1mImage_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  RsGxsChannelGroup *arg1 = (RsGxsChannelGroup *) 0 ;
  RsGxsImage result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannelGroup **)&jarg1; 
  result =  ((arg1)->mImage);
  *(RsGxsImage **)&jresult = new RsGxsImage((const RsGxsImage &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannelGroup_1mAutoDownload_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jboolean jarg2) {
  RsGxsChannelGroup *arg1 = (RsGxsChannelGroup *) 0 ;
  bool arg2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannelGroup **)&jarg1; 
  arg2 = jarg2 ? true : false; 
  if (arg1) (arg1)->mAutoDownload = arg2;
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannelGroup_1mAutoDownload_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jboolean jresult = 0 ;
  RsGxsChannelGroup *arg1 = (RsGxsChannelGroup *) 0 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannelGroup **)&jarg1; 
  result = (bool) ((arg1)->mAutoDownload);
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_new_1RsGxsChannelGroup(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  RsGxsChannelGroup *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  result = (RsGxsChannelGroup *)new RsGxsChannelGroup();
  *(RsGxsChannelGroup **)&jresult = result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_delete_1RsGxsChannelGroup(JNIEnv *jenv, jclass jcls, jlong jarg1) {
  RsGxsChannelGroup *arg1 = (RsGxsChannelGroup *) 0 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = *(RsGxsChannelGroup **)&jarg1; 
  delete arg1;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannelPost_1mMeta_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  RsGxsChannelPost *arg1 = (RsGxsChannelPost *) 0 ;
  RsMsgMetaData arg2 ;
  RsMsgMetaData *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannelPost **)&jarg1; 
  argp2 = *(RsMsgMetaData **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null RsMsgMetaData");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->mMeta = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannelPost_1mMeta_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  RsGxsChannelPost *arg1 = (RsGxsChannelPost *) 0 ;
  RsMsgMetaData result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannelPost **)&jarg1; 
  result =  ((arg1)->mMeta);
  *(RsMsgMetaData **)&jresult = new RsMsgMetaData((const RsMsgMetaData &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannelPost_1mMsg_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  RsGxsChannelPost *arg1 = (RsGxsChannelPost *) 0 ;
  std::string arg2 ;
  std::string *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannelPost **)&jarg1; 
  argp2 = *(std::string **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null std::string");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->mMsg = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannelPost_1mMsg_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  RsGxsChannelPost *arg1 = (RsGxsChannelPost *) 0 ;
  std::string result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannelPost **)&jarg1; 
  result =  ((arg1)->mMsg);
  *(std::string **)&jresult = new std::string((const std::string &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannelPost_1mFiles_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  RsGxsChannelPost *arg1 = (RsGxsChannelPost *) 0 ;
  std::list< RsGxsFile > arg2 ;
  std::list< RsGxsFile > *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannelPost **)&jarg1; 
  argp2 = *(std::list< RsGxsFile > **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null std::list< RsGxsFile >");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->mFiles = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannelPost_1mFiles_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  RsGxsChannelPost *arg1 = (RsGxsChannelPost *) 0 ;
  std::list< RsGxsFile > result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannelPost **)&jarg1; 
  result =  ((arg1)->mFiles);
  *(std::list< RsGxsFile > **)&jresult = new std::list< RsGxsFile >((const std::list< RsGxsFile > &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannelPost_1mCount_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  RsGxsChannelPost *arg1 = (RsGxsChannelPost *) 0 ;
  uint32_t arg2 ;
  uint32_t *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannelPost **)&jarg1; 
  argp2 = *(uint32_t **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint32_t");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->mCount = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannelPost_1mCount_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  RsGxsChannelPost *arg1 = (RsGxsChannelPost *) 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannelPost **)&jarg1; 
  result =  ((arg1)->mCount);
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannelPost_1mSize_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  RsGxsChannelPost *arg1 = (RsGxsChannelPost *) 0 ;
  uint64_t arg2 ;
  uint64_t *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannelPost **)&jarg1; 
  argp2 = *(uint64_t **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint64_t");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->mSize = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannelPost_1mSize_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  RsGxsChannelPost *arg1 = (RsGxsChannelPost *) 0 ;
  uint64_t result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannelPost **)&jarg1; 
  result =  ((arg1)->mSize);
  *(uint64_t **)&jresult = new uint64_t((const uint64_t &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannelPost_1mThumbnail_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  RsGxsChannelPost *arg1 = (RsGxsChannelPost *) 0 ;
  RsGxsImage arg2 ;
  RsGxsImage *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannelPost **)&jarg1; 
  argp2 = *(RsGxsImage **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null RsGxsImage");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->mThumbnail = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannelPost_1mThumbnail_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  RsGxsChannelPost *arg1 = (RsGxsChannelPost *) 0 ;
  RsGxsImage result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannelPost **)&jarg1; 
  result =  ((arg1)->mThumbnail);
  *(RsGxsImage **)&jresult = new RsGxsImage((const RsGxsImage &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_new_1RsGxsChannelPost(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  RsGxsChannelPost *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  result = (RsGxsChannelPost *)new RsGxsChannelPost();
  *(RsGxsChannelPost **)&jresult = result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_delete_1RsGxsChannelPost(JNIEnv *jenv, jclass jcls, jlong jarg1) {
  RsGxsChannelPost *arg1 = (RsGxsChannelPost *) 0 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = *(RsGxsChannelPost **)&jarg1; 
  delete arg1;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_delete_1RsGxsChannels(JNIEnv *jenv, jclass jcls, jlong jarg1) {
  RsGxsChannels *arg1 = (RsGxsChannels *) 0 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = *(RsGxsChannels **)&jarg1; 
  delete arg1;
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannels_1getGroupData(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jlong jarg3) {
  jboolean jresult = 0 ;
  RsGxsChannels *arg1 = (RsGxsChannels *) 0 ;
  uint32_t *arg2 = 0 ;
  std::vector< RsGxsChannelGroup > *arg3 = 0 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannels **)&jarg1; 
  arg2 = *(uint32_t **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "uint32_t const & reference is null");
    return 0;
  } 
  arg3 = *(std::vector< RsGxsChannelGroup > **)&jarg3;
  if (!arg3) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::vector< RsGxsChannelGroup > & reference is null");
    return 0;
  } 
  result = (bool)(arg1)->getGroupData((uint32_t const &)*arg2,*arg3);
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannels_1getPostData(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jlong jarg3) {
  jboolean jresult = 0 ;
  RsGxsChannels *arg1 = (RsGxsChannels *) 0 ;
  uint32_t *arg2 = 0 ;
  std::vector< RsGxsChannelPost > *arg3 = 0 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannels **)&jarg1; 
  arg2 = *(uint32_t **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "uint32_t const & reference is null");
    return 0;
  } 
  arg3 = *(std::vector< RsGxsChannelPost > **)&jarg3;
  if (!arg3) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::vector< RsGxsChannelPost > & reference is null");
    return 0;
  } 
  result = (bool)(arg1)->getPostData((uint32_t const &)*arg2,*arg3);
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannels_1getRelatedPosts(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jlong jarg3) {
  jboolean jresult = 0 ;
  RsGxsChannels *arg1 = (RsGxsChannels *) 0 ;
  uint32_t *arg2 = 0 ;
  std::vector< RsGxsChannelPost > *arg3 = 0 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannels **)&jarg1; 
  arg2 = *(uint32_t **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "uint32_t const & reference is null");
    return 0;
  } 
  arg3 = *(std::vector< RsGxsChannelPost > **)&jarg3;
  if (!arg3) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::vector< RsGxsChannelPost > & reference is null");
    return 0;
  } 
  result = (bool)(arg1)->getRelatedPosts((uint32_t const &)*arg2,*arg3);
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannels_1setMessageReadStatus(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jlong jarg3, jboolean jarg4) {
  RsGxsChannels *arg1 = (RsGxsChannels *) 0 ;
  uint32_t *arg2 = 0 ;
  RsGxsGrpMsgIdPair *arg3 = 0 ;
  bool arg4 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannels **)&jarg1; 
  arg2 = *(uint32_t **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "uint32_t & reference is null");
    return ;
  } 
  arg3 = *(RsGxsGrpMsgIdPair **)&jarg3;
  if (!arg3) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "RsGxsGrpMsgIdPair const & reference is null");
    return ;
  } 
  arg4 = jarg4 ? true : false; 
  (arg1)->setMessageReadStatus(*arg2,(RsGxsGrpMsgIdPair const &)*arg3,arg4);
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannels_1setChannelAutoDownload(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jboolean jarg3) {
  jboolean jresult = 0 ;
  RsGxsChannels *arg1 = (RsGxsChannels *) 0 ;
  RsGxsGroupId *arg2 = 0 ;
  bool arg3 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannels **)&jarg1; 
  arg2 = *(RsGxsGroupId **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "RsGxsGroupId const & reference is null");
    return 0;
  } 
  arg3 = jarg3 ? true : false; 
  result = (bool)(arg1)->setChannelAutoDownload((RsGxsGroupId const &)*arg2,arg3);
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannels_1getChannelAutoDownload(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  jboolean jresult = 0 ;
  RsGxsChannels *arg1 = (RsGxsChannels *) 0 ;
  RsGxsGroupId *arg2 = 0 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannels **)&jarg1; 
  arg2 = *(RsGxsGroupId **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "RsGxsGroupId const & reference is null");
    return 0;
  } 
  result = (bool)(arg1)->getChannelAutoDownload((RsGxsGroupId const &)*arg2);
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannels_1subscribeToGroup(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jlong jarg3, jboolean jarg4) {
  jboolean jresult = 0 ;
  RsGxsChannels *arg1 = (RsGxsChannels *) 0 ;
  uint32_t *arg2 = 0 ;
  RsGxsGroupId *arg3 = 0 ;
  bool arg4 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannels **)&jarg1; 
  arg2 = *(uint32_t **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "uint32_t & reference is null");
    return 0;
  } 
  arg3 = *(RsGxsGroupId **)&jarg3;
  if (!arg3) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "RsGxsGroupId const & reference is null");
    return 0;
  } 
  arg4 = jarg4 ? true : false; 
  result = (bool)(arg1)->subscribeToGroup(*arg2,(RsGxsGroupId const &)*arg3,arg4);
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannels_1createGroup(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jlong jarg3, jobject jarg3_) {
  jboolean jresult = 0 ;
  RsGxsChannels *arg1 = (RsGxsChannels *) 0 ;
  uint32_t *arg2 = 0 ;
  RsGxsChannelGroup *arg3 = 0 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  (void)jarg3_;
  arg1 = *(RsGxsChannels **)&jarg1; 
  arg2 = *(uint32_t **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "uint32_t & reference is null");
    return 0;
  } 
  arg3 = *(RsGxsChannelGroup **)&jarg3;
  if (!arg3) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "RsGxsChannelGroup & reference is null");
    return 0;
  } 
  result = (bool)(arg1)->createGroup(*arg2,*arg3);
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannels_1createPost(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jlong jarg3, jobject jarg3_) {
  jboolean jresult = 0 ;
  RsGxsChannels *arg1 = (RsGxsChannels *) 0 ;
  uint32_t *arg2 = 0 ;
  RsGxsChannelPost *arg3 = 0 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  (void)jarg3_;
  arg1 = *(RsGxsChannels **)&jarg1; 
  arg2 = *(uint32_t **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "uint32_t & reference is null");
    return 0;
  } 
  arg3 = *(RsGxsChannelPost **)&jarg3;
  if (!arg3) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "RsGxsChannelPost & reference is null");
    return 0;
  } 
  result = (bool)(arg1)->createPost(*arg2,*arg3);
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannels_1ExtraFileHash(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jlong jarg3) {
  jboolean jresult = 0 ;
  RsGxsChannels *arg1 = (RsGxsChannels *) 0 ;
  std::string *arg2 = 0 ;
  std::string arg3 ;
  std::string *argp3 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannels **)&jarg1; 
  arg2 = *(std::string **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::string const & reference is null");
    return 0;
  } 
  argp3 = *(std::string **)&jarg3; 
  if (!argp3) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null std::string");
    return 0;
  }
  arg3 = *argp3; 
  result = (bool)(arg1)->ExtraFileHash((std::string const &)*arg2,arg3);
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsGxsChannels_1ExtraFileRemove(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  jboolean jresult = 0 ;
  RsGxsChannels *arg1 = (RsGxsChannels *) 0 ;
  std::string *arg2 = 0 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsGxsChannels **)&jarg1; 
  arg2 = *(std::string **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::string const & reference is null");
    return 0;
  } 
  result = (bool)(arg1)->ExtraFileRemove((std::string const &)*arg2);
  jresult = (jboolean)result; 
  return jresult;
}


#ifdef __cplusplus
}
#endif
