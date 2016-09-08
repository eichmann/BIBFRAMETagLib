package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicAspectRatio extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicAspectRatio currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicAspectRatio.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Electronic theElectronic = (Electronic)findAncestorWithClass(this, Electronic.class);
			if (!theElectronic.commitNeeded) {
				pageContext.getOut().print(theElectronic.getAspectRatio());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for aspectRatio tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for aspectRatio tag ");
		}
		return SKIP_BODY;
	}

	public String getAspectRatio() throws JspTagException {
		try {
			Electronic theElectronic = (Electronic)findAncestorWithClass(this, Electronic.class);
			return theElectronic.getAspectRatio();
		} catch (Exception e) {
			log.error(" Can't find enclosing Electronic for aspectRatio tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for aspectRatio tag ");
		}
	}

	public void setAspectRatio(String aspectRatio) throws JspTagException {
		try {
			Electronic theElectronic = (Electronic)findAncestorWithClass(this, Electronic.class);
			theElectronic.setAspectRatio(aspectRatio);
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for aspectRatio tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for aspectRatio tag ");
		}
	}
}

