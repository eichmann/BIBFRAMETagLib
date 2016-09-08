package edu.uiowa.slis.BIBFRAME.Family;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FamilyLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FamilyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(FamilyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Family theFamily = (Family)findAncestorWithClass(this, Family.class);
			if (!theFamily.commitNeeded) {
				pageContext.getOut().print(theFamily.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Family for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Family for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Family theFamily = (Family)findAncestorWithClass(this, Family.class);
			return theFamily.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Family for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Family for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Family theFamily = (Family)findAncestorWithClass(this, Family.class);
			theFamily.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Family for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Family for label tag ");
		}
	}
}

