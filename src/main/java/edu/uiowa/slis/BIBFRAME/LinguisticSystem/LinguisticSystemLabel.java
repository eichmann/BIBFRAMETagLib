package edu.uiowa.slis.BIBFRAME.LinguisticSystem;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LinguisticSystemLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LinguisticSystemLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LinguisticSystemLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LinguisticSystem theLinguisticSystem = (LinguisticSystem)findAncestorWithClass(this, LinguisticSystem.class);
			if (!theLinguisticSystem.commitNeeded) {
				pageContext.getOut().print(theLinguisticSystem.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LinguisticSystem for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LinguisticSystem for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			LinguisticSystem theLinguisticSystem = (LinguisticSystem)findAncestorWithClass(this, LinguisticSystem.class);
			return theLinguisticSystem.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing LinguisticSystem for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LinguisticSystem for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			LinguisticSystem theLinguisticSystem = (LinguisticSystem)findAncestorWithClass(this, LinguisticSystem.class);
			theLinguisticSystem.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing LinguisticSystem for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LinguisticSystem for label tag ");
		}
	}
}

