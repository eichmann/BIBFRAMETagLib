package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetLanguageIterator theDatasetLanguageIterator = (DatasetLanguageIterator)findAncestorWithClass(this, DatasetLanguageIterator.class);
			pageContext.getOut().print(theDatasetLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for language tag ");
		}
		return SKIP_BODY;
	}
}

