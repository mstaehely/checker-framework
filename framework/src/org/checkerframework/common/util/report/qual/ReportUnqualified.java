package org.checkerframework.common.util.report.qual;

import org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import org.checkerframework.framework.qual.InvisibleQualifier;
import org.checkerframework.framework.qual.SubtypeOf;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * An annotation intended solely for representing an unqualified type in
 * the qualifier hierarchy for the Report Checker
 * <p>
 * Note that because of the missing RetentionPolicy, the qualifier will
 * not be stored in bytecode.
 */
@InvisibleQualifier
@SubtypeOf({})
@DefaultQualifierInHierarchy
@Target({ElementType.TYPE_USE})
public @interface ReportUnqualified { }