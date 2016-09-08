package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObject theThreeDimensionalObject = (ThreeDimensionalObject)findAncestorWithClass(this, ThreeDimensionalObject.class);
			if (!theThreeDimensionalObject.commitNeeded) {
				pageContext.getOut().print(theThreeDimensionalObject.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ThreeDimensionalObject theThreeDimensionalObject = (ThreeDimensionalObject)findAncestorWithClass(this, ThreeDimensionalObject.class);
			return theThreeDimensionalObject.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ThreeDimensionalObject for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ThreeDimensionalObject theThreeDimensionalObject = (ThreeDimensionalObject)findAncestorWithClass(this, ThreeDimensionalObject.class);
			theThreeDimensionalObject.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for label tag ");
		}
	}
}

