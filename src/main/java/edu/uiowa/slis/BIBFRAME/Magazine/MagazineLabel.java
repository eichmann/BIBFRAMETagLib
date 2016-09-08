package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Magazine theMagazine = (Magazine)findAncestorWithClass(this, Magazine.class);
			if (!theMagazine.commitNeeded) {
				pageContext.getOut().print(theMagazine.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Magazine theMagazine = (Magazine)findAncestorWithClass(this, Magazine.class);
			return theMagazine.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Magazine for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Magazine theMagazine = (Magazine)findAncestorWithClass(this, Magazine.class);
			theMagazine.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for label tag ");
		}
	}
}

