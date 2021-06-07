/*
 * Copyright 2017-2021 Dromara.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.7.2.
// **********************************************************************

package org.dromara.hmily.demo.tars.account.servant.accountapp;

import com.qq.tars.protocol.annotation.Servant;
import com.qq.tars.protocol.tars.annotation.TarsMethodParameter;

@Servant
public interface AccountServant {
	 boolean payment(@TarsMethodParameter(name="userId")String userId, @TarsMethodParameter(name="amount")double amount);
}
