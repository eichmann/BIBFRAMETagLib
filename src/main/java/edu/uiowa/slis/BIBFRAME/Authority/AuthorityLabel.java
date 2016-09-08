package edu.uiowa.slis.BIBFRAME.Authority;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorityLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AuthorityLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorityLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Authority theAuthority = (Authority)findAncestorWithClass(this, Authority.class);
			if (!theAuthority.commitNeeded) {
				pageContext.getOut().print(theAuthority.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Authority for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authority for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Authority theAuthority = (Authority)findAncestorWithClass(this, Authority.class);
			return theAuthority.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Authority for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authority for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Authority theAuthority = (Authority)findAncestorWithClass(this, Authority.class);
			theAuthority.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Authority for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authority for label tag ");
		}
	}
}

