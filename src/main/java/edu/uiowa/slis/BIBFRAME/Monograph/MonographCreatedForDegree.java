package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographCreatedForDegree extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographCreatedForDegree currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographCreatedForDegree.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographCreatedForDegreeIterator theMonographCreatedForDegreeIterator = (MonographCreatedForDegreeIterator)findAncestorWithClass(this, MonographCreatedForDegreeIterator.class);
			pageContext.getOut().print(theMonographCreatedForDegreeIterator.getCreatedForDegree());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

