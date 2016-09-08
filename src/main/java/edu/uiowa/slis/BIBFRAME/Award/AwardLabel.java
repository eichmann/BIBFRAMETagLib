package edu.uiowa.slis.BIBFRAME.Award;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AwardLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Award theAward = (Award)findAncestorWithClass(this, Award.class);
			if (!theAward.commitNeeded) {
				pageContext.getOut().print(theAward.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Award for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Award for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Award theAward = (Award)findAncestorWithClass(this, Award.class);
			return theAward.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Award for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Award for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Award theAward = (Award)findAncestorWithClass(this, Award.class);
			theAward.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Award for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Award for label tag ");
		}
	}
}

