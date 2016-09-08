package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ContinuingResource theContinuingResource = (ContinuingResource)findAncestorWithClass(this, ContinuingResource.class);
			if (!theContinuingResource.commitNeeded) {
				pageContext.getOut().print(theContinuingResource.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ContinuingResource theContinuingResource = (ContinuingResource)findAncestorWithClass(this, ContinuingResource.class);
			return theContinuingResource.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ContinuingResource for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ContinuingResource theContinuingResource = (ContinuingResource)findAncestorWithClass(this, ContinuingResource.class);
			theContinuingResource.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for subjectURI tag ");
		}
	}
}

