/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Specifies the health check settings to use when evaluating the health state
 * of your EC2 instances.
 * </p>
 * <p>
 * For more information, see <a href=
 * "http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-healthchecks.html"
 * >Configure Health Checks for Your Load Balancer</a> in the <i>Classic Load
 * Balancers Guide</i>.
 * </p>
 */
public class ConfigureHealthCheckRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;

    /**
     * <p>
     * The configuration information.
     * </p>
     */
    private HealthCheck healthCheck;

    /**
     * Default constructor for ConfigureHealthCheckRequest object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     */
    public ConfigureHealthCheckRequest() {
    }

    /**
     * Constructs a new ConfigureHealthCheckRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     * @param healthCheck <p>
     *            The configuration information.
     *            </p>
     */
    public ConfigureHealthCheckRequest(String loadBalancerName, HealthCheck healthCheck) {
        setLoadBalancerName(loadBalancerName);
        setHealthCheck(healthCheck);
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     *
     * @return <p>
     *         The name of the load balancer.
     *         </p>
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     *
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerName <p>
     *            The name of the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfigureHealthCheckRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * The configuration information.
     * </p>
     *
     * @return <p>
     *         The configuration information.
     *         </p>
     */
    public HealthCheck getHealthCheck() {
        return healthCheck;
    }

    /**
     * <p>
     * The configuration information.
     * </p>
     *
     * @param healthCheck <p>
     *            The configuration information.
     *            </p>
     */
    public void setHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }

    /**
     * <p>
     * The configuration information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthCheck <p>
     *            The configuration information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfigureHealthCheckRequest withHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLoadBalancerName() != null)
            sb.append("LoadBalancerName: " + getLoadBalancerName() + ",");
        if (getHealthCheck() != null)
            sb.append("HealthCheck: " + getHealthCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode
                + ((getHealthCheck() == null) ? 0 : getHealthCheck().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigureHealthCheckRequest == false)
            return false;
        ConfigureHealthCheckRequest other = (ConfigureHealthCheckRequest) obj;

        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null
                && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getHealthCheck() == null ^ this.getHealthCheck() == null)
            return false;
        if (other.getHealthCheck() != null
                && other.getHealthCheck().equals(this.getHealthCheck()) == false)
            return false;
        return true;
    }
}
