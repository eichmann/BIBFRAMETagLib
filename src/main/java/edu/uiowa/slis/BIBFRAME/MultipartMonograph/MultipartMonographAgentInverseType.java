package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographAgentInverseIterator theMultipartMonographAgentInverseIterator = (MultipartMonographAgentInverseIterator)findAncestorWithClass(this, MultipartMonographAgentInverseIterator.class);
			pageContext.getOut().print(theMultipartMonographAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for agent tag ");
		}
		return SKIP_BODY;
	}
}

