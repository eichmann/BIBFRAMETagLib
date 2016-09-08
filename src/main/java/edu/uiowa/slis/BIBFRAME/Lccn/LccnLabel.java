package edu.uiowa.slis.BIBFRAME.Lccn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LccnLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LccnLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LccnLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Lccn theLccn = (Lccn)findAncestorWithClass(this, Lccn.class);
			if (!theLccn.commitNeeded) {
				pageContext.getOut().print(theLccn.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Lccn for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Lccn for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Lccn theLccn = (Lccn)findAncestorWithClass(this, Lccn.class);
			return theLccn.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Lccn for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Lccn for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Lccn theLccn = (Lccn)findAncestorWithClass(this, Lccn.class);
			theLccn.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Lccn for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Lccn for label tag ");
		}
	}
}

