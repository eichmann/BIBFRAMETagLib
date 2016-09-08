package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographCreatedForDegreeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographCreatedForDegreeType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographCreatedForDegreeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographCreatedForDegreeIterator theMultipartMonographCreatedForDegreeIterator = (MultipartMonographCreatedForDegreeIterator)findAncestorWithClass(this, MultipartMonographCreatedForDegreeIterator.class);
			pageContext.getOut().print(theMultipartMonographCreatedForDegreeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

