package edu.uiowa.slis.BIBFRAME.Policy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PolicyHasRetentionPolicyInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PolicyHasRetentionPolicyInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PolicyHasRetentionPolicyInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PolicyHasRetentionPolicyInverseIterator thePolicyHasRetentionPolicyInverseIterator = (PolicyHasRetentionPolicyInverseIterator)findAncestorWithClass(this, PolicyHasRetentionPolicyInverseIterator.class);
			pageContext.getOut().print(thePolicyHasRetentionPolicyInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Policy for hasRetentionPolicy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Policy for hasRetentionPolicy tag ");
		}
		return SKIP_BODY;
	}
}

