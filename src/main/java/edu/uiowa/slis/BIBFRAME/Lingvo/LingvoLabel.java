package edu.uiowa.slis.BIBFRAME.Lingvo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LingvoLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LingvoLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LingvoLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Lingvo theLingvo = (Lingvo)findAncestorWithClass(this, Lingvo.class);
			if (!theLingvo.commitNeeded) {
				pageContext.getOut().print(theLingvo.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Lingvo for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Lingvo for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Lingvo theLingvo = (Lingvo)findAncestorWithClass(this, Lingvo.class);
			return theLingvo.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Lingvo for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Lingvo for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Lingvo theLingvo = (Lingvo)findAncestorWithClass(this, Lingvo.class);
			theLingvo.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Lingvo for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Lingvo for label tag ");
		}
	}
}

