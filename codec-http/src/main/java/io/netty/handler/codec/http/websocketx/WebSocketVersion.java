/*
 * Copyright 2011 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.handler.codec.http.websocketx;

/**
 * <p>
 * Versions of the web socket specification.
 * </p>
 * <p>
 * A specification is tied to one wire protocol version but a protocol version may have use by more than 1 version of
 * the specification.
 * </p>
 */
public enum WebSocketVersion {
    UNKNOWN,

    /**
     * <a href= "http://tools.ietf.org/html/draft-ietf-hybi-thewebsocketprotocol-00"
     * >draft-ietf-hybi-thewebsocketprotocol- 00</a>.
     */
    V00,

    /**
     * <a href= "http://tools.ietf.org/html/draft-ietf-hybi-thewebsocketprotocol-10"
     * >draft-ietf-hybi-thewebsocketprotocol- 10</a>
     */
    V08,

    /**
     * <a href="http://tools.ietf.org/html/rfc6455 ">RFC 6455</a>. This was originally <a href=
     * "http://tools.ietf.org/html/draft-ietf-hybi-thewebsocketprotocol-17" >draft-ietf-hybi-thewebsocketprotocol-
     * 17</a>
     */
    V13;

    /**
     * @return Value for HTTP Header 'Sec-WebSocket-Version'
     */
    public String toHttpHeaderValue() {
        if (this == V00) {
            return "0";
        } else if (this == V08) {
            return "8";
        } else if (this == V13) {
            return "13";
        }
        throw new IllegalStateException("Unknown web socket version: " + this);
    }
}
