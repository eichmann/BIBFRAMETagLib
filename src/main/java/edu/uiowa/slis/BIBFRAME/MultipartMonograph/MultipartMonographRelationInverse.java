package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographRelationInverseIterator theMultipartMonographRelationInverseIterator = (MultipartMonographRelationInverseIterator)findAncestorWithClass(this, MultipartMonographRelationInverseIterator.class);
			pageContext.getOut().print(theMultipartMonographRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for relation tag ");
		}
		return SKIP_BODY;
	}
}

