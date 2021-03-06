/*
 * Copyright 2012-2013 iDA MediaFoundry (www.ida-mediafoundry.be)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package pckg.annotatedbootstraplifecycle;

import be.idamediafoundry.sofa.livecycle.dsc.annotations.FactoryMethod;
import be.idamediafoundry.sofa.livecycle.dsc.annotations.Service;

@Service
public class TestComponentWithFactoryMethod {
	
	private String config;
	
	public String operation(String param) {
		return "string";
	}
	
	public void setConfig(String config) {
		this.config = config;
	}
	
	@FactoryMethod
	public static TestComponentWithFactoryMethod getInstance() {
		return new TestComponentWithFactoryMethod();
	}
}