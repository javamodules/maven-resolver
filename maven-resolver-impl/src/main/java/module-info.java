/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * Maven Resolver Implementation
 */
module org.apache.maven.resolver.impl {
    requires static java.inject;
    requires org.slf4j;
    requires org.apache.maven.resolver;
    requires org.apache.maven.resolver.spi;
    requires org.apache.maven.resolver.named;
    requires org.apache.maven.resolver.util;

    exports org.eclipse.aether.impl;
    exports org.eclipse.aether.internal.impl;
    exports org.eclipse.aether.internal.impl.checksum;
    exports org.eclipse.aether.internal.impl.collect;
    exports org.eclipse.aether.internal.impl.filter;
    exports org.eclipse.aether.internal.impl.resolution;
    exports org.eclipse.aether.internal.impl.scope;
    exports org.eclipse.aether.internal.impl.session;
    exports org.eclipse.aether.internal.impl.synccontext;
    exports org.eclipse.aether.internal.impl.transport.http;
}
