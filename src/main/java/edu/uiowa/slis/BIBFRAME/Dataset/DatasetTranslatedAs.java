package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetTranslatedAs extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetTranslatedAs currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetTranslatedAs.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetTranslatedAsIterator theDatasetTranslatedAsIterator = (DatasetTranslatedAsIterator)findAncestorWithClass(this, DatasetTranslatedAsIterator.class);
			pageContext.getOut().print(theDatasetTranslatedAsIterator.getTranslatedAs());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

