package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Monograph theMonograph = (Monograph)findAncestorWithClass(this, Monograph.class);
			if (!theMonograph.commitNeeded) {
				pageContext.getOut().print(theMonograph.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Monograph theMonograph = (Monograph)findAncestorWithClass(this, Monograph.class);
			return theMonograph.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Monograph for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Monograph theMonograph = (Monograph)findAncestorWithClass(this, Monograph.class);
			theMonograph.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for label tag ");
		}
	}
}

