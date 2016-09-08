package edu.uiowa.slis.BIBFRAME.Issn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssnLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IssnLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(IssnLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Issn theIssn = (Issn)findAncestorWithClass(this, Issn.class);
			if (!theIssn.commitNeeded) {
				pageContext.getOut().print(theIssn.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Issn for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issn for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Issn theIssn = (Issn)findAncestorWithClass(this, Issn.class);
			return theIssn.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Issn for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issn for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Issn theIssn = (Issn)findAncestorWithClass(this, Issn.class);
			theIssn.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Issn for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issn for label tag ");
		}
	}
}

