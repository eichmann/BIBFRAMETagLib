package edu.uiowa.slis.BIBFRAME.PolicySet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PolicySetSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PolicySetSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PolicySetSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PolicySet thePolicySet = (PolicySet)findAncestorWithClass(this, PolicySet.class);
			if (!thePolicySet.commitNeeded) {
				pageContext.getOut().print(thePolicySet.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PolicySet for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PolicySet for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			PolicySet thePolicySet = (PolicySet)findAncestorWithClass(this, PolicySet.class);
			return thePolicySet.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing PolicySet for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PolicySet for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			PolicySet thePolicySet = (PolicySet)findAncestorWithClass(this, PolicySet.class);
			thePolicySet.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing PolicySet for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PolicySet for subjectURI tag ");
		}
	}
}

