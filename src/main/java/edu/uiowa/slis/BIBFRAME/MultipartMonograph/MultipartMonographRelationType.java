package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographRelationIterator theMultipartMonographRelationIterator = (MultipartMonographRelationIterator)findAncestorWithClass(this, MultipartMonographRelationIterator.class);
			pageContext.getOut().print(theMultipartMonographRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for relation tag ");
		}
		return SKIP_BODY;
	}
}

