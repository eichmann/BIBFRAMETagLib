package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographRelationInverseIterator theMultipartMonographRelationInverseIterator = (MultipartMonographRelationInverseIterator)findAncestorWithClass(this, MultipartMonographRelationInverseIterator.class);
			pageContext.getOut().print(theMultipartMonographRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for relation tag ");
		}
		return SKIP_BODY;
	}
}

