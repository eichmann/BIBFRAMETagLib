package edu.uiowa.slis.BIBFRAME.Audience;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudienceLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudienceLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AudienceLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Audience theAudience = (Audience)findAncestorWithClass(this, Audience.class);
			if (!theAudience.commitNeeded) {
				pageContext.getOut().print(theAudience.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Audience for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audience for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Audience theAudience = (Audience)findAncestorWithClass(this, Audience.class);
			return theAudience.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Audience for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audience for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Audience theAudience = (Audience)findAncestorWithClass(this, Audience.class);
			theAudience.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Audience for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audience for label tag ");
		}
	}
}

