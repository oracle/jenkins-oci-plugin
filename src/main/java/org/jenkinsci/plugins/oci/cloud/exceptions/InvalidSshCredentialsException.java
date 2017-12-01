/**
 * Jenkins OCI Plugin
 *
 * Copyright (c) 2017, Oracle and/or its affiliates. All rights reserved.
 * Licensed under the Universal Permissive License v 1.0 as shown at http://oss.oracle.com/licenses/upl.
 */
package org.jenkinsci.plugins.oci.cloud.exceptions;

public class InvalidSshCredentialsException extends Exception {
  public InvalidSshCredentialsException(Throwable cause) {
    super(cause);
  }
}
