package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexCreatedForDegreeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexCreatedForDegreeType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexCreatedForDegreeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexCreatedForDegreeIterator theIndexCreatedForDegreeIterator = (IndexCreatedForDegreeIterator)findAncestorWithClass(this, IndexCreatedForDegreeIterator.class);
			pageContext.getOut().print(theIndexCreatedForDegreeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

