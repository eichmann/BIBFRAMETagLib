package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicDimensions extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicDimensions currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicDimensions.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ElectronicDimensionsIterator theElectronic = (ElectronicDimensionsIterator)findAncestorWithClass(this, ElectronicDimensionsIterator.class);
			pageContext.getOut().print(theElectronic.getDimensions());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for dimensions tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for dimensions tag ");
		}
		return SKIP_BODY;
	}
}

