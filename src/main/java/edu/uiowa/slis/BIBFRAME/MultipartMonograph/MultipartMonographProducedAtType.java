package edu.uiowa.slis.BIBFRAME.MultipartMonograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultipartMonographProducedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultipartMonographProducedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultipartMonographProducedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultipartMonographProducedAtIterator theMultipartMonographProducedAtIterator = (MultipartMonographProducedAtIterator)findAncestorWithClass(this, MultipartMonographProducedAtIterator.class);
			pageContext.getOut().print(theMultipartMonographProducedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultipartMonograph for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultipartMonograph for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

