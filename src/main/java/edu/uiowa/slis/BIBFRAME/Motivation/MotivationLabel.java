package edu.uiowa.slis.BIBFRAME.Motivation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MotivationLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MotivationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(MotivationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Motivation theMotivation = (Motivation)findAncestorWithClass(this, Motivation.class);
			if (!theMotivation.commitNeeded) {
				pageContext.getOut().print(theMotivation.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Motivation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Motivation for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Motivation theMotivation = (Motivation)findAncestorWithClass(this, Motivation.class);
			return theMotivation.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Motivation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Motivation for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Motivation theMotivation = (Motivation)findAncestorWithClass(this, Motivation.class);
			theMotivation.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Motivation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Motivation for label tag ");
		}
	}
}

