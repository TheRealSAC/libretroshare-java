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

SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_rsTurtle_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  RsTurtle *arg1 = (RsTurtle *) 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsTurtle **)&jarg1; 
  rsTurtle = arg1;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_rsTurtle_1get(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  RsTurtle *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  result = (RsTurtle *)rsTurtle;
  *(RsTurtle **)&jresult = result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_TurtleFileInfo_1hash_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  TurtleFileInfo *arg1 = (TurtleFileInfo *) 0 ;
  std::string arg2 ;
  std::string *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleFileInfo **)&jarg1; 
  argp2 = *(std::string **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null std::string");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->hash = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_TurtleFileInfo_1hash_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  TurtleFileInfo *arg1 = (TurtleFileInfo *) 0 ;
  std::string result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleFileInfo **)&jarg1; 
  result =  ((arg1)->hash);
  *(std::string **)&jresult = new std::string((const std::string &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_TurtleFileInfo_1name_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  TurtleFileInfo *arg1 = (TurtleFileInfo *) 0 ;
  std::string arg2 ;
  std::string *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleFileInfo **)&jarg1; 
  argp2 = *(std::string **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null std::string");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->name = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_TurtleFileInfo_1name_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  TurtleFileInfo *arg1 = (TurtleFileInfo *) 0 ;
  std::string result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleFileInfo **)&jarg1; 
  result =  ((arg1)->name);
  *(std::string **)&jresult = new std::string((const std::string &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_TurtleFileInfo_1size_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  TurtleFileInfo *arg1 = (TurtleFileInfo *) 0 ;
  uint64_t arg2 ;
  uint64_t *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleFileInfo **)&jarg1; 
  argp2 = *(uint64_t **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint64_t");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->size = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_TurtleFileInfo_1size_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  TurtleFileInfo *arg1 = (TurtleFileInfo *) 0 ;
  uint64_t result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleFileInfo **)&jarg1; 
  result =  ((arg1)->size);
  *(uint64_t **)&jresult = new uint64_t((const uint64_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_new_1TurtleFileInfo(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  TurtleFileInfo *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  result = (TurtleFileInfo *)new TurtleFileInfo();
  *(TurtleFileInfo **)&jresult = result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_delete_1TurtleFileInfo(JNIEnv *jenv, jclass jcls, jlong jarg1) {
  TurtleFileInfo *arg1 = (TurtleFileInfo *) 0 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = *(TurtleFileInfo **)&jarg1; 
  delete arg1;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_TurtleRequestDisplayInfo_1request_1id_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  TurtleRequestDisplayInfo *arg1 = (TurtleRequestDisplayInfo *) 0 ;
  uint32_t arg2 ;
  uint32_t *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleRequestDisplayInfo **)&jarg1; 
  argp2 = *(uint32_t **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint32_t");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->request_id = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_TurtleRequestDisplayInfo_1request_1id_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  TurtleRequestDisplayInfo *arg1 = (TurtleRequestDisplayInfo *) 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleRequestDisplayInfo **)&jarg1; 
  result =  ((arg1)->request_id);
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_TurtleRequestDisplayInfo_1source_1peer_1id_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  TurtleRequestDisplayInfo *arg1 = (TurtleRequestDisplayInfo *) 0 ;
  std::string arg2 ;
  std::string *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleRequestDisplayInfo **)&jarg1; 
  argp2 = *(std::string **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null std::string");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->source_peer_id = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_TurtleRequestDisplayInfo_1source_1peer_1id_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  TurtleRequestDisplayInfo *arg1 = (TurtleRequestDisplayInfo *) 0 ;
  std::string result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleRequestDisplayInfo **)&jarg1; 
  result =  ((arg1)->source_peer_id);
  *(std::string **)&jresult = new std::string((const std::string &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_TurtleRequestDisplayInfo_1age_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  TurtleRequestDisplayInfo *arg1 = (TurtleRequestDisplayInfo *) 0 ;
  uint32_t arg2 ;
  uint32_t *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleRequestDisplayInfo **)&jarg1; 
  argp2 = *(uint32_t **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint32_t");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->age = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_TurtleRequestDisplayInfo_1age_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  TurtleRequestDisplayInfo *arg1 = (TurtleRequestDisplayInfo *) 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleRequestDisplayInfo **)&jarg1; 
  result =  ((arg1)->age);
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_TurtleRequestDisplayInfo_1depth_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  TurtleRequestDisplayInfo *arg1 = (TurtleRequestDisplayInfo *) 0 ;
  uint32_t arg2 ;
  uint32_t *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleRequestDisplayInfo **)&jarg1; 
  argp2 = *(uint32_t **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null uint32_t");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->depth = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_TurtleRequestDisplayInfo_1depth_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  TurtleRequestDisplayInfo *arg1 = (TurtleRequestDisplayInfo *) 0 ;
  uint32_t result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleRequestDisplayInfo **)&jarg1; 
  result =  ((arg1)->depth);
  *(uint32_t **)&jresult = new uint32_t((const uint32_t &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_new_1TurtleRequestDisplayInfo(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  TurtleRequestDisplayInfo *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  result = (TurtleRequestDisplayInfo *)new TurtleRequestDisplayInfo();
  *(TurtleRequestDisplayInfo **)&jresult = result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_delete_1TurtleRequestDisplayInfo(JNIEnv *jenv, jclass jcls, jlong jarg1) {
  TurtleRequestDisplayInfo *arg1 = (TurtleRequestDisplayInfo *) 0 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = *(TurtleRequestDisplayInfo **)&jarg1; 
  delete arg1;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_TurtleTrafficStatisticsInfo_1unknown_1updn_1Bps_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jfloat jarg2) {
  TurtleTrafficStatisticsInfo *arg1 = (TurtleTrafficStatisticsInfo *) 0 ;
  float arg2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleTrafficStatisticsInfo **)&jarg1; 
  arg2 = (float)jarg2; 
  if (arg1) (arg1)->unknown_updn_Bps = arg2;
}


SWIGEXPORT jfloat JNICALL Java_net_retroshare_RetroshareJNI_TurtleTrafficStatisticsInfo_1unknown_1updn_1Bps_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jfloat jresult = 0 ;
  TurtleTrafficStatisticsInfo *arg1 = (TurtleTrafficStatisticsInfo *) 0 ;
  float result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleTrafficStatisticsInfo **)&jarg1; 
  result = (float) ((arg1)->unknown_updn_Bps);
  jresult = (jfloat)result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_TurtleTrafficStatisticsInfo_1data_1up_1Bps_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jfloat jarg2) {
  TurtleTrafficStatisticsInfo *arg1 = (TurtleTrafficStatisticsInfo *) 0 ;
  float arg2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleTrafficStatisticsInfo **)&jarg1; 
  arg2 = (float)jarg2; 
  if (arg1) (arg1)->data_up_Bps = arg2;
}


SWIGEXPORT jfloat JNICALL Java_net_retroshare_RetroshareJNI_TurtleTrafficStatisticsInfo_1data_1up_1Bps_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jfloat jresult = 0 ;
  TurtleTrafficStatisticsInfo *arg1 = (TurtleTrafficStatisticsInfo *) 0 ;
  float result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleTrafficStatisticsInfo **)&jarg1; 
  result = (float) ((arg1)->data_up_Bps);
  jresult = (jfloat)result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_TurtleTrafficStatisticsInfo_1data_1dn_1Bps_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jfloat jarg2) {
  TurtleTrafficStatisticsInfo *arg1 = (TurtleTrafficStatisticsInfo *) 0 ;
  float arg2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleTrafficStatisticsInfo **)&jarg1; 
  arg2 = (float)jarg2; 
  if (arg1) (arg1)->data_dn_Bps = arg2;
}


SWIGEXPORT jfloat JNICALL Java_net_retroshare_RetroshareJNI_TurtleTrafficStatisticsInfo_1data_1dn_1Bps_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jfloat jresult = 0 ;
  TurtleTrafficStatisticsInfo *arg1 = (TurtleTrafficStatisticsInfo *) 0 ;
  float result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleTrafficStatisticsInfo **)&jarg1; 
  result = (float) ((arg1)->data_dn_Bps);
  jresult = (jfloat)result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_TurtleTrafficStatisticsInfo_1tr_1up_1Bps_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jfloat jarg2) {
  TurtleTrafficStatisticsInfo *arg1 = (TurtleTrafficStatisticsInfo *) 0 ;
  float arg2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleTrafficStatisticsInfo **)&jarg1; 
  arg2 = (float)jarg2; 
  if (arg1) (arg1)->tr_up_Bps = arg2;
}


SWIGEXPORT jfloat JNICALL Java_net_retroshare_RetroshareJNI_TurtleTrafficStatisticsInfo_1tr_1up_1Bps_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jfloat jresult = 0 ;
  TurtleTrafficStatisticsInfo *arg1 = (TurtleTrafficStatisticsInfo *) 0 ;
  float result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleTrafficStatisticsInfo **)&jarg1; 
  result = (float) ((arg1)->tr_up_Bps);
  jresult = (jfloat)result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_TurtleTrafficStatisticsInfo_1tr_1dn_1Bps_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jfloat jarg2) {
  TurtleTrafficStatisticsInfo *arg1 = (TurtleTrafficStatisticsInfo *) 0 ;
  float arg2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleTrafficStatisticsInfo **)&jarg1; 
  arg2 = (float)jarg2; 
  if (arg1) (arg1)->tr_dn_Bps = arg2;
}


SWIGEXPORT jfloat JNICALL Java_net_retroshare_RetroshareJNI_TurtleTrafficStatisticsInfo_1tr_1dn_1Bps_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jfloat jresult = 0 ;
  TurtleTrafficStatisticsInfo *arg1 = (TurtleTrafficStatisticsInfo *) 0 ;
  float result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleTrafficStatisticsInfo **)&jarg1; 
  result = (float) ((arg1)->tr_dn_Bps);
  jresult = (jfloat)result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_TurtleTrafficStatisticsInfo_1total_1up_1Bps_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jfloat jarg2) {
  TurtleTrafficStatisticsInfo *arg1 = (TurtleTrafficStatisticsInfo *) 0 ;
  float arg2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleTrafficStatisticsInfo **)&jarg1; 
  arg2 = (float)jarg2; 
  if (arg1) (arg1)->total_up_Bps = arg2;
}


SWIGEXPORT jfloat JNICALL Java_net_retroshare_RetroshareJNI_TurtleTrafficStatisticsInfo_1total_1up_1Bps_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jfloat jresult = 0 ;
  TurtleTrafficStatisticsInfo *arg1 = (TurtleTrafficStatisticsInfo *) 0 ;
  float result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleTrafficStatisticsInfo **)&jarg1; 
  result = (float) ((arg1)->total_up_Bps);
  jresult = (jfloat)result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_TurtleTrafficStatisticsInfo_1total_1dn_1Bps_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jfloat jarg2) {
  TurtleTrafficStatisticsInfo *arg1 = (TurtleTrafficStatisticsInfo *) 0 ;
  float arg2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleTrafficStatisticsInfo **)&jarg1; 
  arg2 = (float)jarg2; 
  if (arg1) (arg1)->total_dn_Bps = arg2;
}


SWIGEXPORT jfloat JNICALL Java_net_retroshare_RetroshareJNI_TurtleTrafficStatisticsInfo_1total_1dn_1Bps_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jfloat jresult = 0 ;
  TurtleTrafficStatisticsInfo *arg1 = (TurtleTrafficStatisticsInfo *) 0 ;
  float result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleTrafficStatisticsInfo **)&jarg1; 
  result = (float) ((arg1)->total_dn_Bps);
  jresult = (jfloat)result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_TurtleTrafficStatisticsInfo_1forward_1probabilities_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  TurtleTrafficStatisticsInfo *arg1 = (TurtleTrafficStatisticsInfo *) 0 ;
  std::vector< float > arg2 ;
  std::vector< float > *argp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleTrafficStatisticsInfo **)&jarg1; 
  argp2 = *(std::vector< float > **)&jarg2; 
  if (!argp2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "Attempt to dereference null std::vector< float >");
    return ;
  }
  arg2 = *argp2; 
  if (arg1) (arg1)->forward_probabilities = arg2;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_TurtleTrafficStatisticsInfo_1forward_1probabilities_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  TurtleTrafficStatisticsInfo *arg1 = (TurtleTrafficStatisticsInfo *) 0 ;
  std::vector< float > result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(TurtleTrafficStatisticsInfo **)&jarg1; 
  result =  ((arg1)->forward_probabilities);
  *(std::vector< float > **)&jresult = new std::vector< float >((const std::vector< float > &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_new_1TurtleTrafficStatisticsInfo(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  TurtleTrafficStatisticsInfo *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  result = (TurtleTrafficStatisticsInfo *)new TurtleTrafficStatisticsInfo();
  *(TurtleTrafficStatisticsInfo **)&jresult = result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_delete_1TurtleTrafficStatisticsInfo(JNIEnv *jenv, jclass jcls, jlong jarg1) {
  TurtleTrafficStatisticsInfo *arg1 = (TurtleTrafficStatisticsInfo *) 0 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = *(TurtleTrafficStatisticsInfo **)&jarg1; 
  delete arg1;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_delete_1RsTurtle(JNIEnv *jenv, jclass jcls, jlong jarg1) {
  RsTurtle *arg1 = (RsTurtle *) 0 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = *(RsTurtle **)&jarg1; 
  delete arg1;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsTurtle_1setEnabled(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jboolean jarg2) {
  RsTurtle *arg1 = (RsTurtle *) 0 ;
  bool arg2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsTurtle **)&jarg1; 
  arg2 = jarg2 ? true : false; 
  (arg1)->setEnabled(arg2);
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsTurtle_1enabled(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jboolean jresult = 0 ;
  RsTurtle *arg1 = (RsTurtle *) 0 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsTurtle **)&jarg1; 
  result = (bool)((RsTurtle const *)arg1)->enabled();
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsTurtle_1setSessionEnabled(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jboolean jarg2) {
  RsTurtle *arg1 = (RsTurtle *) 0 ;
  bool arg2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsTurtle **)&jarg1; 
  arg2 = jarg2 ? true : false; 
  (arg1)->setSessionEnabled(arg2);
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsTurtle_1sessionEnabled(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jboolean jresult = 0 ;
  RsTurtle *arg1 = (RsTurtle *) 0 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsTurtle **)&jarg1; 
  result = (bool)((RsTurtle const *)arg1)->sessionEnabled();
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RsTurtle_1turtleSearch_1_1SWIG_10(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  jlong jresult = 0 ;
  RsTurtle *arg1 = (RsTurtle *) 0 ;
  std::string *arg2 = 0 ;
  TurtleRequestId result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsTurtle **)&jarg1; 
  arg2 = *(std::string **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::string const & reference is null");
    return 0;
  } 
  result = (arg1)->turtleSearch((std::string const &)*arg2);
  *(TurtleRequestId **)&jresult = new TurtleRequestId((const TurtleRequestId &)result); 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_net_retroshare_RetroshareJNI_RsTurtle_1turtleSearch_1_1SWIG_11(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  jlong jresult = 0 ;
  RsTurtle *arg1 = (RsTurtle *) 0 ;
  LinearizedExpression *arg2 = 0 ;
  TurtleRequestId result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsTurtle **)&jarg1; 
  arg2 = *(LinearizedExpression **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "LinearizedExpression const & reference is null");
    return 0;
  } 
  result = (arg1)->turtleSearch((LinearizedExpression const &)*arg2);
  *(TurtleRequestId **)&jresult = new TurtleRequestId((const TurtleRequestId &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsTurtle_1monitorTunnels(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jlong jarg3) {
  RsTurtle *arg1 = (RsTurtle *) 0 ;
  std::string *arg2 = 0 ;
  RsTurtleClientService *arg3 = (RsTurtleClientService *) 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsTurtle **)&jarg1; 
  arg2 = *(std::string **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::string const & reference is null");
    return ;
  } 
  arg3 = *(RsTurtleClientService **)&jarg3; 
  (arg1)->monitorTunnels((std::string const &)*arg2,arg3);
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsTurtle_1stopMonitoringTunnels(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  RsTurtle *arg1 = (RsTurtle *) 0 ;
  std::string *arg2 = 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsTurtle **)&jarg1; 
  arg2 = *(std::string **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::string const & reference is null");
    return ;
  } 
  (arg1)->stopMonitoringTunnels((std::string const &)*arg2);
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsTurtle_1registerTunnelService(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  RsTurtle *arg1 = (RsTurtle *) 0 ;
  RsTurtleClientService *arg2 = (RsTurtleClientService *) 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsTurtle **)&jarg1; 
  arg2 = *(RsTurtleClientService **)&jarg2; 
  (arg1)->registerTunnelService(arg2);
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsTurtle_1getInfo(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jlong jarg3, jlong jarg4, jlong jarg5) {
  RsTurtle *arg1 = (RsTurtle *) 0 ;
  std::vector< std::vector< std::string > > *arg2 = 0 ;
  std::vector< std::vector< std::string > > *arg3 = 0 ;
  std::vector< TurtleRequestDisplayInfo > *arg4 = 0 ;
  std::vector< TurtleRequestDisplayInfo > *arg5 = 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsTurtle **)&jarg1; 
  arg2 = *(std::vector< std::vector< std::string > > **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::vector< std::vector< std::string > > & reference is null");
    return ;
  } 
  arg3 = *(std::vector< std::vector< std::string > > **)&jarg3;
  if (!arg3) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::vector< std::vector< std::string > > & reference is null");
    return ;
  } 
  arg4 = *(std::vector< TurtleRequestDisplayInfo > **)&jarg4;
  if (!arg4) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::vector< TurtleRequestDisplayInfo > & reference is null");
    return ;
  } 
  arg5 = *(std::vector< TurtleRequestDisplayInfo > **)&jarg5;
  if (!arg5) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::vector< TurtleRequestDisplayInfo > & reference is null");
    return ;
  } 
  ((RsTurtle const *)arg1)->getInfo(*arg2,*arg3,*arg4,*arg5);
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsTurtle_1getTrafficStatistics(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jobject jarg2_) {
  RsTurtle *arg1 = (RsTurtle *) 0 ;
  TurtleTrafficStatisticsInfo *arg2 = 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  (void)jarg2_;
  arg1 = *(RsTurtle **)&jarg1; 
  arg2 = *(TurtleTrafficStatisticsInfo **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "TurtleTrafficStatisticsInfo & reference is null");
    return ;
  } 
  ((RsTurtle const *)arg1)->getTrafficStatistics(*arg2);
}


SWIGEXPORT jboolean JNICALL Java_net_retroshare_RetroshareJNI_RsTurtle_1isTurtlePeer(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  jboolean jresult = 0 ;
  RsTurtle *arg1 = (RsTurtle *) 0 ;
  std::string *arg2 = 0 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsTurtle **)&jarg1; 
  arg2 = *(std::string **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "std::string const & reference is null");
    return 0;
  } 
  result = (bool)((RsTurtle const *)arg1)->isTurtlePeer((std::string const &)*arg2);
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_net_retroshare_RetroshareJNI_RsTurtle_1setMaxTRForwardRate(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jint jarg2) {
  RsTurtle *arg1 = (RsTurtle *) 0 ;
  int arg2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsTurtle **)&jarg1; 
  arg2 = (int)jarg2; 
  (arg1)->setMaxTRForwardRate(arg2);
}


SWIGEXPORT jint JNICALL Java_net_retroshare_RetroshareJNI_RsTurtle_1getMaxTRForwardRate(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jint jresult = 0 ;
  RsTurtle *arg1 = (RsTurtle *) 0 ;
  int result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(RsTurtle **)&jarg1; 
  result = (int)((RsTurtle const *)arg1)->getMaxTRForwardRate();
  jresult = (jint)result; 
  return jresult;
}


#ifdef __cplusplus
}
#endif
