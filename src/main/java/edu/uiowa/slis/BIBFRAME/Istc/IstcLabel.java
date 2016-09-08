package edu.uiowa.slis.BIBFRAME.Istc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IstcLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IstcLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(IstcLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Istc theIstc = (Istc)findAncestorWithClass(this, Istc.class);
			if (!theIstc.commitNeeded) {
				pageContext.getOut().print(theIstc.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Istc for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Istc for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Istc theIstc = (Istc)findAncestorWithClass(this, Istc.class);
			return theIstc.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Istc for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Istc for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Istc theIstc = (Istc)findAncestorWithClass(this, Istc.class);
			theIstc.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Istc for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Istc for label tag ");
		}
	}
}

