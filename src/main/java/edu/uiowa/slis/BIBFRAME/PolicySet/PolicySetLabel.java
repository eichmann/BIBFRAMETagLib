package edu.uiowa.slis.BIBFRAME.PolicySet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PolicySetLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PolicySetLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PolicySetLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PolicySet thePolicySet = (PolicySet)findAncestorWithClass(this, PolicySet.class);
			if (!thePolicySet.commitNeeded) {
				pageContext.getOut().print(thePolicySet.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PolicySet for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PolicySet for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			PolicySet thePolicySet = (PolicySet)findAncestorWithClass(this, PolicySet.class);
			return thePolicySet.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing PolicySet for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PolicySet for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			PolicySet thePolicySet = (PolicySet)findAncestorWithClass(this, PolicySet.class);
			thePolicySet.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing PolicySet for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PolicySet for label tag ");
		}
	}
}

