/*
 * Copyright 2003-2013 MarkLogic Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.marklogic.xcc.exceptions;

/**
 * Superclass of all exceptions specific to XCC. This is an abstract class and will never be thrown
 * directly. Only subclasses will be ever be thrown. You can name this class in a try/catch clause
 * to catch all checked XCC exceptions.
 */
public abstract class XccException extends Exception {
    private static final long serialVersionUID = 6808111270701351078L;

    protected XccException(String message) {
        super(message);
    }

    protected XccException(String message, Throwable cause) {
        super(message, cause);
    }
}